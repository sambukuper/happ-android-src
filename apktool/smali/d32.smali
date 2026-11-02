.class public final Ld32;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lf72;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method

.method public final b(Ljd0;Ljd0;Lsx4;)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p2, Ldl3;

    .line 8
    .line 9
    if-eqz p0, :cond_9

    .line 10
    .line 11
    move-object p0, p2

    .line 12
    check-cast p0, Ldl3;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljo2;->getTypeParameters()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-nez p3, :cond_0

    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_0
    invoke-static {p1, p2}, Lhf5;->i(Ljd0;Ljd0;)Lgf5;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    const/4 v0, 0x0

    .line 31
    if-eqz p3, :cond_1

    .line 32
    .line 33
    invoke-virtual {p3}, Lgf5;->b()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move p3, v0

    .line 39
    :goto_0
    if-eqz p3, :cond_2

    .line 40
    .line 41
    goto/16 :goto_2

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, Ljo2;->L()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v1, Lhu;

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    invoke-direct {v1, p3, v2}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    sget-object p3, Lcl1;->Z:Lcl1;

    .line 57
    .line 58
    invoke-static {v1, p3}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    iget-object v1, p0, Ljo2;->k0:Lt14;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v3, Lhu;

    .line 68
    .line 69
    const/4 v4, 0x5

    .line 70
    invoke-direct {v3, v1, v4}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    const/4 v1, 0x2

    .line 74
    new-array v4, v1, [Lu27;

    .line 75
    .line 76
    aput-object p3, v4, v0

    .line 77
    .line 78
    aput-object v3, v4, v2

    .line 79
    .line 80
    invoke-static {v4}, Leu;->Y([Ljava/lang/Object;)Lu27;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    invoke-static {p3}, Lw27;->g0(Lu27;)Lsd2;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    iget-object p0, p0, Ljo2;->m0:Li44;

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    if-eqz p0, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0}, Li44;->c()Lt14;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    move-object p0, v3

    .line 99
    :goto_1
    invoke-static {p0}, Li21;->M(Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    new-instance v4, Lhu;

    .line 104
    .line 105
    invoke-direct {v4, p0, v2}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    new-array p0, v1, [Lu27;

    .line 109
    .line 110
    aput-object p3, p0, v0

    .line 111
    .line 112
    aput-object v4, p0, v2

    .line 113
    .line 114
    invoke-static {p0}, Leu;->Y([Ljava/lang/Object;)Lu27;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0}, Lw27;->g0(Lu27;)Lsd2;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    new-instance p3, Lrd2;

    .line 123
    .line 124
    invoke-direct {p3, p0}, Lrd2;-><init>(Lsd2;)V

    .line 125
    .line 126
    .line 127
    :cond_4
    invoke-virtual {p3}, Lrd2;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-eqz p0, :cond_5

    .line 132
    .line 133
    invoke-virtual {p3}, Lrd2;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, Lt14;

    .line 138
    .line 139
    invoke-virtual {p0}, Lt14;->l0()Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-nez v1, :cond_4

    .line 148
    .line 149
    invoke-virtual {p0}, Lt14;->q0()Lmo8;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    instance-of p0, p0, Lr66;

    .line 154
    .line 155
    if-nez p0, :cond_4

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_5
    new-instance p0, Lq66;

    .line 159
    .line 160
    invoke-direct {p0}, Lq66;-><init>()V

    .line 161
    .line 162
    .line 163
    new-instance p3, Lwi8;

    .line 164
    .line 165
    invoke-direct {p3, p0}, Lwi8;-><init>(Lui8;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {p1, p3}, Lew7;->g(Lwi8;)Lgd1;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    check-cast p0, Ljd0;

    .line 173
    .line 174
    if-nez p0, :cond_6

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_6
    instance-of p1, p0, Lq97;

    .line 178
    .line 179
    if-eqz p1, :cond_7

    .line 180
    .line 181
    move-object p1, p0

    .line 182
    check-cast p1, Lq97;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljo2;->getTypeParameters()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object p3

    .line 188
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result p3

    .line 192
    if-nez p3, :cond_7

    .line 193
    .line 194
    invoke-interface {p1}, Lho2;->i0()Lgo2;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-interface {p0}, Lgo2;->o()Lgo2;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-interface {p0}, Lgo2;->build()Lho2;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    :cond_7
    sget-object p1, Lhf5;->c:Lhf5;

    .line 210
    .line 211
    invoke-virtual {p1, p0, p2, v0}, Lhf5;->n(Ljd0;Ljd0;Z)Lgf5;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {p0}, Lgf5;->b()I

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    if-eqz p0, :cond_8

    .line 220
    .line 221
    sget-object p1, Lc32;->a:[I

    .line 222
    .line 223
    invoke-static {p0}, Lp61;->B(I)I

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    aget p0, p1, p0

    .line 228
    .line 229
    if-ne p0, v2, :cond_9

    .line 230
    .line 231
    return v2

    .line 232
    :cond_8
    throw v3

    .line 233
    :cond_9
    :goto_2
    const/4 p0, 0x3

    .line 234
    return p0
.end method
