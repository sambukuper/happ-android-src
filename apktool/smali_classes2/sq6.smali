.class public final Lsq6;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Loh7;

.field public final c:Lh76;

.field public final d:Lu77;

.field public final e:Lf76;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkq6;

    .line 5
    .line 6
    sget-object v1, Ldm5;->f0:Ldm5;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v0, v1, v3, v2}, Lkq6;-><init>(Lcm5;Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lsq6;->b:Loh7;

    .line 21
    .line 22
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lsq6;->c:Lh76;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    const/4 v1, 0x7

    .line 30
    invoke-static {v0, v1, v3}, Lv77;->b(IILl90;)Lu77;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lsq6;->d:Lu77;

    .line 35
    .line 36
    invoke-static {v0}, Ljm4;->m(Lu77;)Lf76;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lsq6;->e:Lf76;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final e()V
    .locals 6

    .line 1
    iget-object p0, p0, Lsq6;->b:Loh7;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Lkq6;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v2, Ldm5;->f0:Ldm5;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x4

    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-static {v1, v2, v5, v3, v4}, Lkq6;->a(Lkq6;Lcm5;Ljava/lang/String;ZI)Lkq6;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p0, v0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    return-void
.end method

.method public final f(Lqq6;)V
    .locals 7

    .line 1
    instance-of v0, p1, Loq6;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lsq6;->b:Loh7;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {v3}, Loh7;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, Lkq6;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-static {v0, v2, v2, v4, v1}, Lkq6;->a(Lkq6;Lcm5;Ljava/lang/String;ZI)Lkq6;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v3, p1, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, Lr5;

    .line 38
    .line 39
    const/16 v3, 0x1c

    .line 40
    .line 41
    invoke-direct {v0, p0, v2, v3}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v2, v0, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    instance-of v0, p1, Lnq6;

    .line 49
    .line 50
    iget-object v4, p0, Lsq6;->c:Lh76;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-object p1, v4, Lh76;->X:Loh7;

    .line 55
    .line 56
    invoke-virtual {p1}, Loh7;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lkq6;

    .line 61
    .line 62
    iget-object p1, p1, Lkq6;->b:Ljava/lang/String;

    .line 63
    .line 64
    if-nez p1, :cond_2

    .line 65
    .line 66
    goto/16 :goto_1

    .line 67
    .line 68
    :cond_2
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v3, Ljy2;

    .line 73
    .line 74
    const/16 v4, 0x1b

    .line 75
    .line 76
    invoke-direct {v3, p0, p1, v2, v4}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v2, v3, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    instance-of v0, p1, Lpq6;

    .line 84
    .line 85
    if-eqz v0, :cond_6

    .line 86
    .line 87
    check-cast p1, Lpq6;

    .line 88
    .line 89
    iget-object v0, p1, Lpq6;->a:Ljava/lang/String;

    .line 90
    .line 91
    iget-object p0, v4, Lh76;->X:Loh7;

    .line 92
    .line 93
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Lkq6;

    .line 98
    .line 99
    iget-object p0, p0, Lkq6;->a:Lcm5;

    .line 100
    .line 101
    sget-object p1, Ldm5;->f0:Ldm5;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance v1, Lem5;

    .line 107
    .line 108
    invoke-direct {v1, p1}, Lem5;-><init>(Ldm5;)V

    .line 109
    .line 110
    .line 111
    check-cast p0, Lb2;

    .line 112
    .line 113
    invoke-virtual {p0}, Lb2;->a()Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_4

    .line 126
    .line 127
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, Ljava/util/Map$Entry;

    .line 132
    .line 133
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Lyr7;

    .line 142
    .line 143
    check-cast v2, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 144
    .line 145
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    new-instance v4, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 150
    .line 151
    invoke-direct {v4, v2}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v2, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    iget-object v5, p1, Lyr7;->a:Ljava/lang/String;

    .line 159
    .line 160
    iget-object p1, p1, Lyr7;->b:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 161
    .line 162
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v6, Lyr7;

    .line 169
    .line 170
    invoke-direct {v6, v5, p1, v2}, Lyr7;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;Z)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v4, v6}, Lem5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_4
    invoke-virtual {v1}, Lem5;->f()Lcm5;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    :cond_5
    invoke-virtual {v3}, Loh7;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    move-object p1, p0

    .line 189
    check-cast p1, Lkq6;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    const/4 v2, 0x0

    .line 195
    const/4 v4, 0x4

    .line 196
    invoke-static {p1, v1, v0, v2, v4}, Lkq6;->a(Lkq6;Lcm5;Ljava/lang/String;ZI)Lkq6;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {v3, p0, p1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    if-eqz p0, :cond_5

    .line 205
    .line 206
    :goto_1
    return-void

    .line 207
    :cond_6
    instance-of p1, p1, Lmq6;

    .line 208
    .line 209
    if-eqz p1, :cond_7

    .line 210
    .line 211
    invoke-virtual {p0}, Lsq6;->e()V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_7
    invoke-static {}, Lb61;->c()V

    .line 216
    .line 217
    .line 218
    return-void
.end method
