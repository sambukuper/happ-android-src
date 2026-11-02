.class public final Lvw4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:J

.field public final synthetic Y:Ldn2;

.field public final synthetic Z:Lo87;

.field public final synthetic f0:Lax4;

.field public final synthetic g0:Loi;

.field public final synthetic h0:Lb71;

.field public final synthetic i0:Lgn2;

.field public final synthetic j0:F

.field public final synthetic k0:Z

.field public final synthetic l0:Lx67;

.field public final synthetic m0:J

.field public final synthetic n0:J

.field public final synthetic o0:Lrn2;

.field public final synthetic p0:Lrn2;

.field public final synthetic q0:Lzy0;


# direct methods
.method public constructor <init>(JLdn2;Lo87;Lax4;Loi;Lb71;Lgn2;FZLx67;JJLrn2;Lrn2;Lzy0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lvw4;->X:J

    .line 5
    .line 6
    iput-object p3, p0, Lvw4;->Y:Ldn2;

    .line 7
    .line 8
    iput-object p4, p0, Lvw4;->Z:Lo87;

    .line 9
    .line 10
    iput-object p5, p0, Lvw4;->f0:Lax4;

    .line 11
    .line 12
    iput-object p6, p0, Lvw4;->g0:Loi;

    .line 13
    .line 14
    iput-object p7, p0, Lvw4;->h0:Lb71;

    .line 15
    .line 16
    iput-object p8, p0, Lvw4;->i0:Lgn2;

    .line 17
    .line 18
    iput p9, p0, Lvw4;->j0:F

    .line 19
    .line 20
    iput-boolean p10, p0, Lvw4;->k0:Z

    .line 21
    .line 22
    iput-object p11, p0, Lvw4;->l0:Lx67;

    .line 23
    .line 24
    iput-wide p12, p0, Lvw4;->m0:J

    .line 25
    .line 26
    iput-wide p14, p0, Lvw4;->n0:J

    .line 27
    .line 28
    move-object/from16 p1, p16

    .line 29
    .line 30
    iput-object p1, p0, Lvw4;->o0:Lrn2;

    .line 31
    .line 32
    move-object/from16 p1, p17

    .line 33
    .line 34
    iput-object p1, p0, Lvw4;->p0:Lrn2;

    .line 35
    .line 36
    move-object/from16 p1, p18

    .line 37
    .line 38
    iput-object p1, p0, Lvw4;->q0:Lzy0;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    check-cast v6, Llp2;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v8, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v8

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v4

    .line 25
    :goto_0
    and-int/2addr v1, v8

    .line 26
    invoke-virtual {v6, v1, v2}, Llp2;->N(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_6

    .line 31
    .line 32
    sget-object v1, Landroidx/compose/foundation/layout/b;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 33
    .line 34
    sget-object v2, Lz91;->e:Lut8;

    .line 35
    .line 36
    invoke-static {v1, v2}, Lz91;->T(Lkx4;Lgn2;)Lkx4;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v6}, Llp2;->K()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    sget-object v3, Lzz0;->a:Lbe;

    .line 45
    .line 46
    if-ne v2, v3, :cond_1

    .line 47
    .line 48
    new-instance v2, Luh3;

    .line 49
    .line 50
    const/16 v3, 0x1d

    .line 51
    .line 52
    invoke-direct {v2, v3}, Luh3;-><init>(B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    check-cast v2, Lgn2;

    .line 59
    .line 60
    invoke-static {v1, v4, v2}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sget-object v2, Lpz2;->Z:Lp50;

    .line 65
    .line 66
    invoke-static {v2, v4}, Lg80;->c(Lp50;Z)Lxr4;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v6}, Lkm4;->I(Llp2;)I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {v6}, Llp2;->l()Lkl5;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v6, v1}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    sget-object v7, Luz0;->j:Lpz2;

    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6}, Llp2;->Z()V

    .line 88
    .line 89
    .line 90
    iget-boolean v7, v6, Llp2;->S:Z

    .line 91
    .line 92
    if-eqz v7, :cond_2

    .line 93
    .line 94
    invoke-virtual {v6}, Llp2;->k()V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    invoke-virtual {v6}, Llp2;->j0()V

    .line 99
    .line 100
    .line 101
    :goto_1
    sget-object v7, Lpz2;->B0:Ldx0;

    .line 102
    .line 103
    invoke-static {v7, v6, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    sget-object v2, Lpz2;->A0:Ldx0;

    .line 107
    .line 108
    invoke-static {v2, v6, v5}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object v2, Lpz2;->C0:Ldx0;

    .line 112
    .line 113
    iget-boolean v5, v6, Llp2;->S:Z

    .line 114
    .line 115
    if-nez v5, :cond_3

    .line 116
    .line 117
    invoke-virtual {v6}, Llp2;->K()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    invoke-static {v5, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-nez v5, :cond_4

    .line 130
    .line 131
    :cond_3
    invoke-static {v3, v6, v3, v2}, Lp61;->v(ILlp2;ILdx0;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    sget-object v2, Lpz2;->z0:Ldx0;

    .line 135
    .line 136
    invoke-static {v2, v6, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget-object v9, v0, Lvw4;->Z:Lo87;

    .line 140
    .line 141
    iget-object v1, v9, Lo87;->d:Lt5;

    .line 142
    .line 143
    iget-object v1, v1, Lt5;->j0:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v1, Lzi1;

    .line 146
    .line 147
    invoke-virtual {v1}, Lzi1;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, Lp87;

    .line 152
    .line 153
    sget-object v2, Lp87;->X:Lp87;

    .line 154
    .line 155
    if-eq v1, v2, :cond_5

    .line 156
    .line 157
    move v4, v8

    .line 158
    :cond_5
    iget-object v1, v0, Lvw4;->f0:Lax4;

    .line 159
    .line 160
    iget-boolean v5, v1, Lax4;->b:Z

    .line 161
    .line 162
    const/4 v7, 0x0

    .line 163
    iget-wide v1, v0, Lvw4;->X:J

    .line 164
    .line 165
    iget-object v3, v0, Lvw4;->Y:Ldn2;

    .line 166
    .line 167
    invoke-static/range {v1 .. v7}, Lzw4;->c(JLdn2;ZZLlp2;I)V

    .line 168
    .line 169
    .line 170
    move-object v2, v3

    .line 171
    move-object/from16 v17, v6

    .line 172
    .line 173
    const/16 v18, 0x46

    .line 174
    .line 175
    iget-object v1, v0, Lvw4;->g0:Loi;

    .line 176
    .line 177
    move-object v3, v1

    .line 178
    iget-object v1, v0, Lvw4;->h0:Lb71;

    .line 179
    .line 180
    move-object v4, v3

    .line 181
    iget-object v3, v0, Lvw4;->i0:Lgn2;

    .line 182
    .line 183
    move-object v5, v4

    .line 184
    sget-object v4, Lhx4;->X:Lhx4;

    .line 185
    .line 186
    iget v6, v0, Lvw4;->j0:F

    .line 187
    .line 188
    iget-boolean v7, v0, Lvw4;->k0:Z

    .line 189
    .line 190
    move v10, v8

    .line 191
    iget-object v8, v0, Lvw4;->l0:Lx67;

    .line 192
    .line 193
    move-object v12, v5

    .line 194
    move-object v5, v9

    .line 195
    move v11, v10

    .line 196
    iget-wide v9, v0, Lvw4;->m0:J

    .line 197
    .line 198
    move v13, v11

    .line 199
    move-object v14, v12

    .line 200
    iget-wide v11, v0, Lvw4;->n0:J

    .line 201
    .line 202
    move v15, v13

    .line 203
    const/4 v13, 0x0

    .line 204
    move-object/from16 v16, v14

    .line 205
    .line 206
    iget-object v14, v0, Lvw4;->o0:Lrn2;

    .line 207
    .line 208
    move/from16 v19, v15

    .line 209
    .line 210
    iget-object v15, v0, Lvw4;->p0:Lrn2;

    .line 211
    .line 212
    iget-object v0, v0, Lvw4;->q0:Lzy0;

    .line 213
    .line 214
    move-object/from16 v20, v16

    .line 215
    .line 216
    move-object/from16 v16, v0

    .line 217
    .line 218
    move-object/from16 v0, v20

    .line 219
    .line 220
    invoke-static/range {v0 .. v18}, Lzw4;->b(Loi;Lb71;Ldn2;Lgn2;Lkx4;Lo87;FZLx67;JJFLrn2;Lrn2;Lzy0;Llp2;I)V

    .line 221
    .line 222
    .line 223
    move-object/from16 v6, v17

    .line 224
    .line 225
    const/4 v13, 0x1

    .line 226
    invoke-virtual {v6, v13}, Llp2;->p(Z)V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_6
    invoke-virtual {v6}, Llp2;->Q()V

    .line 231
    .line 232
    .line 233
    :goto_2
    sget-object v0, Ldn8;->a:Ldn8;

    .line 234
    .line 235
    return-object v0
.end method
