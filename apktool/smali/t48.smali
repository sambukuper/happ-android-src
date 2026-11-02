.class public final synthetic Lt48;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ly48;


# direct methods
.method public synthetic constructor <init>(Ly48;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lt48;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lt48;->Y:Ly48;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Lt48;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    sget-object v3, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-object p0, p0, Lt48;->Y:Ly48;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Ly48;->u0:Lr68;

    .line 18
    .line 19
    iget-object p0, p0, Lr68;->k:Lrh5;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v3

    .line 25
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 26
    .line 27
    iget-object p0, p0, Ly48;->t0:Ly78;

    .line 28
    .line 29
    invoke-virtual {p0}, Ly78;->c()Lx78;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_1
    check-cast p1, Lpt1;

    .line 45
    .line 46
    invoke-virtual {p0}, Ly48;->d1()V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :pswitch_2
    check-cast p1, Lpt1;

    .line 51
    .line 52
    invoke-virtual {p0}, Ly48;->d1()V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Ly48;->u0:Lr68;

    .line 56
    .line 57
    invoke-virtual {p1}, Lr68;->b()V

    .line 58
    .line 59
    .line 60
    invoke-static {p0}, Lpu;->w(Lnx4;)V

    .line 61
    .line 62
    .line 63
    return-object v3

    .line 64
    :pswitch_3
    check-cast p1, Lz85;

    .line 65
    .line 66
    iget-object v0, p0, Ly48;->t0:Ly78;

    .line 67
    .line 68
    iget-wide v4, p1, Lz85;->a:J

    .line 69
    .line 70
    invoke-virtual {v0}, Ly78;->b()Ly24;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_1

    .line 75
    .line 76
    invoke-interface {p1}, Ly24;->g()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    invoke-interface {p1, v4, v5}, Ly24;->p(J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    :cond_1
    iget-object p1, p0, Ly48;->t0:Ly78;

    .line 87
    .line 88
    invoke-virtual {p1, v4, v5, v2}, Ly78;->d(JZ)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-ltz p1, :cond_2

    .line 93
    .line 94
    iget-object v0, p0, Ly48;->s0:Lkd8;

    .line 95
    .line 96
    invoke-static {p1, p1}, Lct7;->c(II)J

    .line 97
    .line 98
    .line 99
    move-result-wide v1

    .line 100
    invoke-virtual {v0, v1, v2}, Lkd8;->j(J)V

    .line 101
    .line 102
    .line 103
    :cond_2
    iget-object p0, p0, Ly48;->u0:Lr68;

    .line 104
    .line 105
    sget-object p1, Lev2;->X:Lev2;

    .line 106
    .line 107
    invoke-virtual {p0, p1, v4, v5}, Lr68;->B(Lev2;J)V

    .line 108
    .line 109
    .line 110
    return-object v3

    .line 111
    :pswitch_4
    check-cast p1, Lpt1;

    .line 112
    .line 113
    new-instance p1, Lqt1;

    .line 114
    .line 115
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Ly48;->z0:Lxz4;

    .line 119
    .line 120
    invoke-virtual {v0, p1}, Lxz4;->b(Lvf3;)V

    .line 121
    .line 122
    .line 123
    iput-object p1, p0, Ly48;->D0:Lqt1;

    .line 124
    .line 125
    invoke-static {p0}, Lpu;->w(Lnx4;)V

    .line 126
    .line 127
    .line 128
    return-object v3

    .line 129
    :pswitch_5
    check-cast p1, Lpt1;

    .line 130
    .line 131
    invoke-static {p0}, Lpu;->w(Lnx4;)V

    .line 132
    .line 133
    .line 134
    return-object v3

    .line 135
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    iget-boolean v0, p0, Ly48;->w0:Z

    .line 142
    .line 143
    if-eqz p1, :cond_4

    .line 144
    .line 145
    sget-object p1, Ly01;->m:Lox1;

    .line 146
    .line 147
    invoke-static {p0, p1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p1, Lyd3;

    .line 152
    .line 153
    check-cast p1, Lzd3;

    .line 154
    .line 155
    iget-object p1, p1, Lzd3;->a:Lrh5;

    .line 156
    .line 157
    invoke-virtual {p1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Lxd3;

    .line 162
    .line 163
    iget p1, p1, Lxd3;->a:I

    .line 164
    .line 165
    if-ne p1, v2, :cond_3

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_3
    iget-object p1, p0, Ly48;->u0:Lr68;

    .line 169
    .line 170
    invoke-virtual {p1, v1}, Lr68;->w(Z)V

    .line 171
    .line 172
    .line 173
    :goto_0
    if-eqz v0, :cond_5

    .line 174
    .line 175
    invoke-virtual {p0, v1}, Ly48;->g1(Z)V

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_4
    invoke-virtual {p0}, Ly48;->c1()V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Ly48;->s0:Lkd8;

    .line 183
    .line 184
    iget-object v0, p1, Lkd8;->a:Ly68;

    .line 185
    .line 186
    iget-object v1, p1, Lkd8;->b:Lde3;

    .line 187
    .line 188
    iget-object v4, v0, Ly68;->b:Lg48;

    .line 189
    .line 190
    invoke-virtual {v4}, Lg48;->a()Lmj0;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    invoke-virtual {v4}, Lmj0;->A()V

    .line 195
    .line 196
    .line 197
    iget-object v4, v0, Ly68;->b:Lg48;

    .line 198
    .line 199
    const/4 v5, 0x0

    .line 200
    invoke-virtual {v4, v5}, Lg48;->f(Lf88;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v4}, Lkd8;->l(Lg48;)V

    .line 204
    .line 205
    .line 206
    sget-object p1, Le58;->X:Le58;

    .line 207
    .line 208
    invoke-virtual {v0, v1, v2, p1}, Ly68;->b(Lde3;ZLe58;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v2}, Ly68;->f(Z)V

    .line 212
    .line 213
    .line 214
    iget-object p1, v0, Ly68;->b:Lg48;

    .line 215
    .line 216
    iget-boolean p1, p1, Lg48;->g0:Z

    .line 217
    .line 218
    invoke-virtual {v0, p1}, Ly68;->e(Z)V

    .line 219
    .line 220
    .line 221
    iget-object p1, p0, Ly48;->s0:Lkd8;

    .line 222
    .line 223
    invoke-virtual {p1}, Lkd8;->a()V

    .line 224
    .line 225
    .line 226
    :cond_5
    :goto_1
    new-instance p1, Ls48;

    .line 227
    .line 228
    invoke-direct {p1, p0, v2}, Ls48;-><init>(Ly48;B)V

    .line 229
    .line 230
    .line 231
    invoke-static {p0, p1}, Lch3;->N(Ljx4;Ldn2;)V

    .line 232
    .line 233
    .line 234
    return-object v3

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
