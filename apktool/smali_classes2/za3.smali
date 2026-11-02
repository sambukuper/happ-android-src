.class public final Lza3;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lvz7;

.field public final c:Loh7;

.field public final d:Lh76;

.field public final e:Lu77;

.field public final f:Lf76;

.field public g:Log7;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ltv2;

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lza3;->b:Lvz7;

    .line 17
    .line 18
    sget-object v0, Lia3;->a:Lia3;

    .line 19
    .line 20
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lza3;->c:Loh7;

    .line 25
    .line 26
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lza3;->d:Lh76;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    const/4 v1, 0x6

    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {v2, v1, v0}, Lv77;->b(IILl90;)Lu77;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lza3;->e:Lu77;

    .line 40
    .line 41
    invoke-static {v0}, Ljm4;->m(Lu77;)Lf76;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Lza3;->f:Lf76;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final e()Lms;
    .locals 0

    .line 1
    iget-object p0, p0, Lza3;->b:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lms;

    .line 8
    .line 9
    return-object p0
.end method

.method public final f(Lxa3;)V
    .locals 7

    .line 1
    instance-of v0, p1, Lsa3;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    check-cast p1, Lsa3;

    .line 8
    .line 9
    iget-object v0, p1, Lsa3;->a:Lja3;

    .line 10
    .line 11
    iget-object v3, p0, Lza3;->c:Loh7;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v3}, Loh7;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    move-object v4, p1

    .line 21
    check-cast v4, Lja3;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, p1, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v3, Ltp1;->a:Lnf1;

    .line 37
    .line 38
    sget-object v3, Ldm4;->a:Lhv2;

    .line 39
    .line 40
    new-instance v4, Ly9;

    .line 41
    .line 42
    const/4 v5, 0x6

    .line 43
    invoke-direct {v4, v0, p0, v2, v5}, Ly9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v3, v4, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lza3;->g:Log7;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    instance-of v0, p1, Loa3;

    .line 54
    .line 55
    const/4 v3, 0x3

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iget-object p1, p0, Lza3;->g:Log7;

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p1, v2}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v0, Ltk0;

    .line 70
    .line 71
    invoke-direct {v0, p0, v2, v3}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v2, v0, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    instance-of v0, p1, Lra3;

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    iget-object p1, p0, Lza3;->g:Log7;

    .line 83
    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    invoke-virtual {p1, v2}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    new-instance v0, Ltk0;

    .line 94
    .line 95
    invoke-direct {v0, p0, v2, v3}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1, v2, v0, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    instance-of v0, p1, Lwa3;

    .line 103
    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    check-cast p1, Lwa3;

    .line 107
    .line 108
    iget-object p1, p1, Lwa3;->a:Lzo8;

    .line 109
    .line 110
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    new-instance v4, Ljy2;

    .line 115
    .line 116
    invoke-direct {v4, p0, p1, v2, v1}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 117
    .line 118
    .line 119
    invoke-static {v0, v2, v4, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_6
    instance-of v0, p1, Lta3;

    .line 124
    .line 125
    const/4 v1, 0x1

    .line 126
    if-eqz v0, :cond_9

    .line 127
    .line 128
    invoke-virtual {p0}, Lza3;->e()Lms;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 136
    .line 137
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-wide v3, p1, Lms;->e:J

    .line 142
    .line 143
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    const-wide/16 v5, -0x1

    .line 148
    .line 149
    cmp-long v3, v3, v5

    .line 150
    .line 151
    if-eqz v3, :cond_7

    .line 152
    .line 153
    move-object v2, p1

    .line 154
    :cond_7
    if-eqz v2, :cond_8

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 157
    .line 158
    .line 159
    move-result-wide v2

    .line 160
    sget-object p1, Lsu/happ/proxyutility/service/d;->a:Lsu/happ/proxyutility/service/d;

    .line 161
    .line 162
    invoke-static {v0, v2, v3}, Lsu/happ/proxyutility/service/d;->f(Lsu/happ/proxyutility/HappApplication;J)V

    .line 163
    .line 164
    .line 165
    :cond_8
    invoke-virtual {p0, v1}, Lza3;->h(Z)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_9
    instance-of v0, p1, Lua3;

    .line 170
    .line 171
    if-eqz v0, :cond_a

    .line 172
    .line 173
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    new-instance v0, Lya3;

    .line 178
    .line 179
    invoke-direct {v0, p0, v2, v1}, Lya3;-><init>(Lza3;Lq51;B)V

    .line 180
    .line 181
    .line 182
    invoke-static {p1, v2, v0, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_a
    instance-of v0, p1, Lva3;

    .line 187
    .line 188
    if-eqz v0, :cond_b

    .line 189
    .line 190
    new-instance p1, Lya2;

    .line 191
    .line 192
    const/16 v0, 0x16

    .line 193
    .line 194
    invoke-direct {p1, v0}, Lya2;-><init>(B)V

    .line 195
    .line 196
    .line 197
    iget-object p0, p0, Lza3;->c:Loh7;

    .line 198
    .line 199
    invoke-static {p0, p1}, Lu15;->S(Loh7;Lgn2;)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :cond_b
    instance-of v0, p1, Lpa3;

    .line 204
    .line 205
    if-eqz v0, :cond_c

    .line 206
    .line 207
    new-instance p1, Lya2;

    .line 208
    .line 209
    const/16 v0, 0x17

    .line 210
    .line 211
    invoke-direct {p1, v0}, Lya2;-><init>(B)V

    .line 212
    .line 213
    .line 214
    iget-object p0, p0, Lza3;->c:Loh7;

    .line 215
    .line 216
    invoke-static {p0, p1}, Lu15;->S(Loh7;Lgn2;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :cond_c
    instance-of p1, p1, Lqa3;

    .line 221
    .line 222
    if-eqz p1, :cond_d

    .line 223
    .line 224
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    new-instance v0, Lya3;

    .line 229
    .line 230
    const/4 v1, 0x0

    .line 231
    invoke-direct {v0, p0, v2, v1}, Lya3;-><init>(Lza3;Lq51;B)V

    .line 232
    .line 233
    .line 234
    invoke-static {p1, v2, v0, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_d
    invoke-static {}, Lb61;->c()V

    .line 239
    .line 240
    .line 241
    return-void
.end method

.method public final g(Lna3;Luy7;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lza3;->e:Lu77;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu77;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lc71;->X:Lc71;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 13
    .line 14
    return-object p0
.end method

.method public final h(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lza3;->d:Lh76;

    .line 2
    .line 3
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 4
    .line 5
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lga3;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lga3;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget-object p0, p0, Lza3;->c:Loh7;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    :cond_2
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    move-object v2, v1

    .line 30
    check-cast v2, Lja3;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Lga3;->a:Lzo8;

    .line 36
    .line 37
    iget-object v3, v0, Lga3;->b:Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 38
    .line 39
    iget-boolean v4, v0, Lga3;->c:Z

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v5, Lga3;

    .line 48
    .line 49
    invoke-direct {v5, v2, v3, v4, p1}, Lga3;-><init>(Lzo8;Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;ZZ)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v1, v5}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    :goto_1
    return-void
.end method
