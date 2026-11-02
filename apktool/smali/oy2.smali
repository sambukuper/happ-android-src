.class public final synthetic Loy2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ltn2;


# instance fields
.field public final synthetic X:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Loy2;->X:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, Lyn0;->b:Lzy0;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    move-object v2, p2

    .line 10
    check-cast v2, Lmw2;

    .line 11
    .line 12
    move-object/from16 v8, p3

    .line 13
    .line 14
    check-cast v8, Llp2;

    .line 15
    .line 16
    move-object/from16 v3, p4

    .line 17
    .line 18
    check-cast v3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v4, v3, 0x6

    .line 28
    .line 29
    const/4 v5, 0x2

    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v8, v1}, Llp2;->d(I)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    const/4 v4, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v4, v5

    .line 41
    :goto_0
    or-int/2addr v4, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v4, v3

    .line 44
    :goto_1
    const/16 v6, 0x30

    .line 45
    .line 46
    and-int/2addr v3, v6

    .line 47
    if-nez v3, :cond_3

    .line 48
    .line 49
    invoke-virtual {v8, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    const/16 v3, 0x20

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/16 v3, 0x10

    .line 59
    .line 60
    :goto_2
    or-int/2addr v4, v3

    .line 61
    :cond_3
    and-int/lit16 v3, v4, 0x93

    .line 62
    .line 63
    const/16 v7, 0x92

    .line 64
    .line 65
    const/4 v11, 0x0

    .line 66
    const/4 v12, 0x1

    .line 67
    if-eq v3, v7, :cond_4

    .line 68
    .line 69
    move v3, v12

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    move v3, v11

    .line 72
    :goto_3
    and-int/lit8 v7, v4, 0x1

    .line 73
    .line 74
    invoke-virtual {v8, v7, v3}, Llp2;->N(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_7

    .line 79
    .line 80
    sget-object v3, Lpz2;->o0:Lo50;

    .line 81
    .line 82
    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 83
    .line 84
    sget-object v9, Lht;->a:Lct;

    .line 85
    .line 86
    invoke-static {v9, v3, v8, v6}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    iget-wide v9, v8, Llp2;->T:J

    .line 91
    .line 92
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    invoke-virtual {v8}, Llp2;->l()Lkl5;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    invoke-static {v8, v7}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    sget-object v10, Luz0;->j:Lpz2;

    .line 105
    .line 106
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8}, Llp2;->Z()V

    .line 110
    .line 111
    .line 112
    iget-boolean v10, v8, Llp2;->S:Z

    .line 113
    .line 114
    if-eqz v10, :cond_5

    .line 115
    .line 116
    invoke-virtual {v8}, Llp2;->k()V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_5
    invoke-virtual {v8}, Llp2;->j0()V

    .line 121
    .line 122
    .line 123
    :goto_4
    sget-object v10, Lpz2;->B0:Ldx0;

    .line 124
    .line 125
    invoke-static {v10, v8, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    sget-object v3, Lpz2;->A0:Ldx0;

    .line 129
    .line 130
    invoke-static {v3, v8, v9}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    sget-object v6, Lpz2;->C0:Ldx0;

    .line 138
    .line 139
    invoke-static {v6, v8, v3}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v8}, Lpn7;->l(Llp2;)V

    .line 143
    .line 144
    .line 145
    sget-object v3, Lpz2;->z0:Ldx0;

    .line 146
    .line 147
    invoke-static {v3, v8, v7}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    and-int/lit8 v3, v4, 0x7e

    .line 151
    .line 152
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v0, p1, v2, v8, v3}, Lzy0;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    new-instance p1, Ld44;

    .line 160
    .line 161
    const/high16 v0, 0x3f800000    # 1.0f

    .line 162
    .line 163
    invoke-direct {p1, v0, v12}, Ld44;-><init>(FZ)V

    .line 164
    .line 165
    .line 166
    const/4 v0, 0x0

    .line 167
    invoke-static {p1, v0, v5}, Landroidx/compose/foundation/layout/b;->l(Lkx4;FI)Lkx4;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {v8, p1}, Lch3;->f(Llp2;Lkx4;)V

    .line 172
    .line 173
    .line 174
    iget p0, p0, Loy2;->X:I

    .line 175
    .line 176
    if-ne v1, p0, :cond_6

    .line 177
    .line 178
    const p0, -0x5d66d01c

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8, p0}, Llp2;->W(I)V

    .line 182
    .line 183
    .line 184
    sget p0, Lq36;->ic_spinner_checked:I

    .line 185
    .line 186
    invoke-static {p0, v8}, Lu28;->p(ILlp2;)Lg73;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    sget-object p0, Lep;->z:Lox1;

    .line 191
    .line 192
    invoke-virtual {v8, p0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    check-cast p0, Ldp;

    .line 197
    .line 198
    iget-wide v6, p0, Ldp;->a:J

    .line 199
    .line 200
    const/4 v9, 0x0

    .line 201
    const/4 v10, 0x6

    .line 202
    const/4 v4, 0x0

    .line 203
    const/4 v5, 0x0

    .line 204
    invoke-static/range {v3 .. v10}, Los4;->a(Lg73;Lkx4;Ljava/lang/String;JLlp2;II)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v8, v11}, Llp2;->p(Z)V

    .line 208
    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_6
    const p0, -0x5d63873c

    .line 212
    .line 213
    .line 214
    invoke-virtual {v8, p0}, Llp2;->W(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v8, v11}, Llp2;->p(Z)V

    .line 218
    .line 219
    .line 220
    :goto_5
    invoke-virtual {v8, v12}, Llp2;->p(Z)V

    .line 221
    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_7
    invoke-virtual {v8}, Llp2;->Q()V

    .line 225
    .line 226
    .line 227
    :goto_6
    sget-object p0, Ldn8;->a:Ldn8;

    .line 228
    .line 229
    return-object p0
.end method
