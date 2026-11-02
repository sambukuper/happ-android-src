.class public final synthetic Lng;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:J

.field public final synthetic Y:Z

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Lv30;


# direct methods
.method public synthetic constructor <init>(JZLkx4;Lv30;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lng;->X:J

    .line 5
    .line 6
    iput-boolean p3, p0, Lng;->Y:Z

    .line 7
    .line 8
    iput-object p4, p0, Lng;->Z:Lkx4;

    .line 9
    .line 10
    iput-object p5, p0, Lng;->f0:Lv30;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Llp2;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v3

    .line 19
    :goto_0
    and-int/2addr p2, v2

    .line 20
    invoke-virtual {p1, p2, v0}, Llp2;->N(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_8

    .line 25
    .line 26
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iget-wide v4, p0, Lng;->X:J

    .line 32
    .line 33
    cmp-long p2, v4, v0

    .line 34
    .line 35
    iget-boolean v0, p0, Lng;->Y:Z

    .line 36
    .line 37
    iget-object v6, p0, Lng;->Z:Lkx4;

    .line 38
    .line 39
    iget-object p0, p0, Lng;->f0:Lv30;

    .line 40
    .line 41
    sget-object v1, Lzz0;->a:Lbe;

    .line 42
    .line 43
    if-eqz p2, :cond_5

    .line 44
    .line 45
    const p2, 0x34c4c6

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p2}, Llp2;->W(I)V

    .line 49
    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    sget-object p2, Lkm4;->c:Lct;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    sget-object p2, Lkm4;->b:Lct;

    .line 57
    .line 58
    :goto_1
    invoke-static {v4, v5}, Lnt1;->b(J)F

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    invoke-static {v4, v5}, Lnt1;->a(J)F

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    const/4 v10, 0x0

    .line 67
    const/16 v11, 0xc

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/b;->f(Lkx4;FFFFI)Lkx4;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    sget-object v5, Lpz2;->n0:Lo50;

    .line 75
    .line 76
    invoke-static {p2, v5, p1, v3}, Lvq6;->a(Let;Lo50;Llp2;I)Lwq6;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    iget-wide v5, p1, Llp2;->T:J

    .line 81
    .line 82
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-virtual {p1}, Llp2;->l()Lkl5;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-static {p1, v4}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    sget-object v7, Luz0;->j:Lpz2;

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Llp2;->Z()V

    .line 100
    .line 101
    .line 102
    iget-boolean v7, p1, Llp2;->S:Z

    .line 103
    .line 104
    if-eqz v7, :cond_2

    .line 105
    .line 106
    invoke-virtual {p1}, Llp2;->k()V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_2
    invoke-virtual {p1}, Llp2;->j0()V

    .line 111
    .line 112
    .line 113
    :goto_2
    sget-object v7, Lpz2;->B0:Ldx0;

    .line 114
    .line 115
    invoke-static {v7, p1, p2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object p2, Lpz2;->A0:Ldx0;

    .line 119
    .line 120
    invoke-static {p2, p1, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    sget-object v5, Lpz2;->C0:Ldx0;

    .line 128
    .line 129
    invoke-static {v5, p1, p2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-static {p1}, Lpn7;->l(Llp2;)V

    .line 133
    .line 134
    .line 135
    sget-object p2, Lpz2;->z0:Ldx0;

    .line 136
    .line 137
    invoke-static {p2, p1, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, p0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    if-nez p2, :cond_3

    .line 149
    .line 150
    if-ne v4, v1, :cond_4

    .line 151
    .line 152
    :cond_3
    new-instance v4, Log;

    .line 153
    .line 154
    invoke-direct {v4, p0, v3}, Log;-><init>(Lv30;B)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_4
    check-cast v4, Ldn2;

    .line 161
    .line 162
    const/4 p0, 0x6

    .line 163
    sget-object p2, Lhx4;->X:Lhx4;

    .line 164
    .line 165
    invoke-static {p0, v4, p1, p2, v0}, Lw45;->h(ILdn2;Llp2;Lkx4;Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v2}, Llp2;->p(Z)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v3}, Llp2;->p(Z)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_5
    const p2, 0x42f938

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, p2}, Llp2;->W(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, p0}, Llp2;->h(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    if-nez p2, :cond_6

    .line 190
    .line 191
    if-ne v4, v1, :cond_7

    .line 192
    .line 193
    :cond_6
    new-instance v4, Log;

    .line 194
    .line 195
    invoke-direct {v4, p0, v2}, Log;-><init>(Lv30;B)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_7
    check-cast v4, Ldn2;

    .line 202
    .line 203
    invoke-static {v3, v4, p1, v6, v0}, Lw45;->h(ILdn2;Llp2;Lkx4;Z)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, v3}, Llp2;->p(Z)V

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_8
    invoke-virtual {p1}, Llp2;->Q()V

    .line 211
    .line 212
    .line 213
    :goto_3
    sget-object p0, Ldn8;->a:Ldn8;

    .line 214
    .line 215
    return-object p0
.end method
