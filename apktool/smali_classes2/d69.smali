.class public final Ld69;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lvz7;

.field public static final b:Lvz7;

.field public static final c:Lvz7;

.field public static final d:Lvz7;

.field public static final e:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lng8;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lvz7;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Ld69;->a:Lvz7;

    .line 14
    .line 15
    new-instance v0, Lng8;

    .line 16
    .line 17
    const/16 v1, 0x16

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lvz7;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Ld69;->b:Lvz7;

    .line 28
    .line 29
    new-instance v0, Lng8;

    .line 30
    .line 31
    const/16 v1, 0x17

    .line 32
    .line 33
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lvz7;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 39
    .line 40
    .line 41
    sput-object v1, Ld69;->c:Lvz7;

    .line 42
    .line 43
    new-instance v0, Lng8;

    .line 44
    .line 45
    const/16 v1, 0x18

    .line 46
    .line 47
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Lvz7;

    .line 51
    .line 52
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 53
    .line 54
    .line 55
    sput-object v1, Ld69;->d:Lvz7;

    .line 56
    .line 57
    const-string v0, "ntp2-sync.com"

    .line 58
    .line 59
    const-string v1, "time-ntp.com"

    .line 60
    .line 61
    const-string v2, "happ.su"

    .line 62
    .line 63
    const-string v3, "happ-proxy.com"

    .line 64
    .line 65
    const-string v4, "qlimited.link"

    .line 66
    .line 67
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Ld69;->e:Ljava/util/List;

    .line 76
    .line 77
    return-void
.end method

.method public static a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig;)V
    .locals 10

    .line 1
    :try_start_0
    new-instance v0, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/16 v6, 0x3fff

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct/range {v0 .. v6}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p2}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->g(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->e(Ljava/util/ArrayList;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    const-string v2, "proxy"

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    :try_start_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-lez v3, :cond_0

    .line 47
    .line 48
    invoke-static {v1}, Ld69;->g(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    :cond_1
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->a()Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->a()Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const/4 v1, 0x1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    xor-int/2addr p1, v1

    .line 82
    if-ne p1, v1, :cond_3

    .line 83
    .line 84
    invoke-virtual {p3}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->b()Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    :cond_3
    new-instance v3, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;

    .line 96
    .line 97
    const/4 v8, 0x0

    .line 98
    const/16 v9, 0x3fff

    .line 99
    .line 100
    const/4 v4, 0x0

    .line 101
    const/4 v5, 0x0

    .line 102
    const/4 v6, 0x0

    .line 103
    const/4 v7, 0x0

    .line 104
    invoke-direct/range {v3 .. v9}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, p2}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->g(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    new-instance p1, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, p1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->f(Ljava/util/ArrayList;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_7

    .line 127
    .line 128
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, Ljava/lang/String;

    .line 133
    .line 134
    sget-object v0, Lss8;->a:Lss8;

    .line 135
    .line 136
    invoke-static {p1}, Lss8;->A(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_5

    .line 141
    .line 142
    const-string v0, "geoip:"

    .line 143
    .line 144
    const/4 v4, 0x0

    .line 145
    invoke-static {p1, v4, v0}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_4

    .line 150
    .line 151
    :cond_5
    invoke-static {p1}, Ld69;->g(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_6

    .line 156
    .line 157
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_4

    .line 162
    .line 163
    :cond_6
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->b()Ljava/util/ArrayList;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-eqz v0, :cond_4

    .line 168
    .line 169
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_7
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->b()Ljava/util/ArrayList;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    if-eqz p0, :cond_8

    .line 178
    .line 179
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    xor-int/2addr p0, v1

    .line 184
    if-ne p0, v1, :cond_8

    .line 185
    .line 186
    invoke-virtual {p3}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->b()Ljava/util/ArrayList;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :catchall_0
    move-exception v0

    .line 199
    move-object p0, v0

    .line 200
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 201
    .line 202
    if-nez p1, :cond_9

    .line 203
    .line 204
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 205
    .line 206
    if-nez p1, :cond_9

    .line 207
    .line 208
    :cond_8
    return-void

    .line 209
    :cond_9
    throw p0
.end method

.method public static b(Lsu/happ/proxyutility/dto/XRayConfig;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lsu/happ/proxyutility/dto/XRayConfig$Api;

    .line 2
    .line 3
    const-string v1, "StatsService"

    .line 4
    .line 5
    filled-new-array {v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, v1}, Lsu/happ/proxyutility/dto/XRayConfig$Api;-><init>(Ljava/util/ArrayList;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lsu/happ/proxyutility/dto/XRayConfig;->m(Lsu/happ/proxyutility/dto/XRayConfig$Api;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    :goto_0
    return-void

    .line 30
    :cond_0
    throw p0
.end method

.method public static c(Lsu/happ/proxyutility/dto/XRayConfig;Lsu/happ/proxyutility/dto/enums/EConfigObservatoryType;)V
    .locals 7

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->b()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;

    .line 24
    .line 25
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->c()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "proxy"

    .line 30
    .line 31
    invoke-static {v2, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {v1, v2}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->g(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->d()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const-string v0, "proxy-"

    .line 46
    .line 47
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sget-object v1, Lc69;->f:[I

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    aget v1, v1, v2

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    if-eq v1, v2, :cond_5

    .line 61
    .line 62
    const/4 v2, 0x2

    .line 63
    if-eq v1, v2, :cond_4

    .line 64
    .line 65
    const/4 p1, 0x3

    .line 66
    if-eq v1, p1, :cond_3

    .line 67
    .line 68
    const/4 p1, 0x4

    .line 69
    if-ne v1, p1, :cond_2

    .line 70
    .line 71
    new-instance p1, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$BalancerBean;

    .line 72
    .line 73
    new-instance v1, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;

    .line 74
    .line 75
    const-string v2, "leastPing"

    .line 76
    .line 77
    invoke-direct {v1, v2}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, v0, v1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$BalancerBean;-><init>(Ljava/util/List;Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {p1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v1, p1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->c(Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    new-instance p1, Lsu/happ/proxyutility/dto/XRayConfig$ObservatoryObject;

    .line 95
    .line 96
    sget-object v1, Lss8;->a:Lss8;

    .line 97
    .line 98
    invoke-static {}, Lss8;->h()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-direct {p1, v0, v1}, Lsu/happ/proxyutility/dto/XRayConfig$ObservatoryObject;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/dto/XRayConfig;->q(Lsu/happ/proxyutility/dto/XRayConfig$ObservatoryObject;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    new-instance p0, Lb55;

    .line 110
    .line 111
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 112
    .line 113
    .line 114
    throw p0

    .line 115
    :cond_3
    new-instance p1, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$BalancerBean;

    .line 116
    .line 117
    new-instance v1, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;

    .line 118
    .line 119
    const-string v2, "roundRobin"

    .line 120
    .line 121
    invoke-direct {v1, v2}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {p1, v0, v1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$BalancerBean;-><init>(Ljava/util/List;Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {p1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {v0, p1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->c(Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    new-instance v1, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$BalancerBean;

    .line 140
    .line 141
    new-instance v2, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;

    .line 142
    .line 143
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/enums/EConfigObservatoryType;->a()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-direct {v2, p1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {v1, v0, v2}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$BalancerBean;-><init>(Ljava/util/List;Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p1, v0}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->c(Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_5
    new-instance v1, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$BalancerBean;

    .line 166
    .line 167
    new-instance v2, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;

    .line 168
    .line 169
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/enums/EConfigObservatoryType;->a()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-direct {v2, p1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-direct {v1, v0, v2}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$BalancerBean;-><init>(Ljava/util/List;Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$StrategyObject;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {p1, v1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->c(Ljava/util/List;)V

    .line 188
    .line 189
    .line 190
    new-instance p1, Lsu/happ/proxyutility/dto/XRayConfig$BurstObservatoryObject;

    .line 191
    .line 192
    new-instance v1, Lsu/happ/proxyutility/dto/XRayConfig$BurstObservatoryObject$PingConfigObject;

    .line 193
    .line 194
    sget-object v2, Lss8;->a:Lss8;

    .line 195
    .line 196
    invoke-static {}, Lss8;->h()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-direct {v1, v2}, Lsu/happ/proxyutility/dto/XRayConfig$BurstObservatoryObject$PingConfigObject;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-direct {p1, v0, v1}, Lsu/happ/proxyutility/dto/XRayConfig$BurstObservatoryObject;-><init>(Ljava/util/List;Lsu/happ/proxyutility/dto/XRayConfig$BurstObservatoryObject$PingConfigObject;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/dto/XRayConfig;->n(Lsu/happ/proxyutility/dto/XRayConfig$BurstObservatoryObject;)V

    .line 207
    .line 208
    .line 209
    :goto_1
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->a()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    const-string v0, "IPIfNonMatch"

    .line 218
    .line 219
    invoke-static {p1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-eqz p1, :cond_6

    .line 224
    .line 225
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->b()Ljava/util/ArrayList;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    new-instance v0, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;

    .line 234
    .line 235
    const-string p1, "0.0.0.0/0"

    .line 236
    .line 237
    const-string v1, "::/0"

    .line 238
    .line 239
    filled-new-array {p1, v1}, [Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-static {p1}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    const/4 v5, 0x0

    .line 248
    const/16 v6, 0x3ff6

    .line 249
    .line 250
    const/4 v2, 0x0

    .line 251
    const/4 v3, 0x0

    .line 252
    const/4 v4, 0x0

    .line 253
    invoke-direct/range {v0 .. v6}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_6
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->b()Ljava/util/ArrayList;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    new-instance v0, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;

    .line 269
    .line 270
    const/4 v5, 0x0

    .line 271
    const/16 v6, 0x3fb7

    .line 272
    .line 273
    const/4 v1, 0x0

    .line 274
    const/4 v2, 0x0

    .line 275
    const/4 v3, 0x0

    .line 276
    const/4 v4, 0x0

    .line 277
    invoke-direct/range {v0 .. v6}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    :goto_2
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    .line 285
    goto :goto_3

    .line 286
    :catchall_0
    move-exception v0

    .line 287
    move-object p0, v0

    .line 288
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 289
    .line 290
    if-nez p1, :cond_8

    .line 291
    .line 292
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 293
    .line 294
    if-nez p1, :cond_8

    .line 295
    .line 296
    new-instance p1, Lrj6;

    .line 297
    .line 298
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 299
    .line 300
    .line 301
    move-object p0, p1

    .line 302
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 303
    .line 304
    instance-of v0, p0, Lrj6;

    .line 305
    .line 306
    if-eqz v0, :cond_7

    .line 307
    .line 308
    move-object p0, p1

    .line 309
    :cond_7
    check-cast p0, Ljava/lang/Boolean;

    .line 310
    .line 311
    return-void

    .line 312
    :cond_8
    throw p0
.end method

.method public static d(Lsu/happ/proxyutility/dto/XRayConfig;)V
    .locals 10

    .line 1
    :try_start_0
    invoke-static {}, Ld69;->j()Lmn6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lmn6;->k(Lmn6;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->q()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v1

    .line 30
    :goto_0
    if-eqz v0, :cond_4

    .line 31
    .line 32
    invoke-static {}, Ld69;->j()Lmn6;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lmn6;->k(Lmn6;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v2, 0x0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v0, v2

    .line 55
    :goto_1
    new-instance v3, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->x()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 69
    .line 70
    .line 71
    :cond_2
    if-eqz v0, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->k()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->e()Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;->b()Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    new-instance v4, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean$ServersBean;

    .line 95
    .line 96
    const-string v5, "fakedns"

    .line 97
    .line 98
    const/16 v6, 0x7a

    .line 99
    .line 100
    invoke-direct {v4, v5, v2, v3, v6}, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean$ServersBean;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    sget-object v0, Lss8;->a:Lss8;

    .line 107
    .line 108
    invoke-static {}, Lss8;->o()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    const-string v3, "dns-in"

    .line 117
    .line 118
    if-eqz v2, :cond_5

    .line 119
    .line 120
    :try_start_1
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_5

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_7

    .line 136
    .line 137
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 142
    .line 143
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->b()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    const-string v6, "dokodemo-door"

    .line 148
    .line 149
    invoke-static {v5, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_6

    .line 154
    .line 155
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->e()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-static {v4, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-eqz v4, :cond_6

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_7
    :goto_2
    new-instance v2, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;

    .line 167
    .line 168
    sget-object v4, Lss8;->a:Lss8;

    .line 169
    .line 170
    invoke-static {v0}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    check-cast v4, Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {v4}, Lss8;->y(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-eqz v4, :cond_8

    .line 181
    .line 182
    invoke-static {v0}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Ljava/lang/String;

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_8
    const-string v0, "1.1.1.1"

    .line 190
    .line 191
    :goto_3
    const/16 v4, 0x3f

    .line 192
    .line 193
    invoke-direct {v2, v0, v4}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;-><init>(Ljava/lang/String;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-static {}, Ln67;->c()Lcom/tencent/mmkv/MMKV;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    const-string v5, "pref_local_dns_port"

    .line 205
    .line 206
    invoke-virtual {v4, v5}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    const-string v5, "10853"

    .line 211
    .line 212
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    invoke-static {v5, v4}, Lss8;->C(ILjava/lang/String;)I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    new-instance v5, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 221
    .line 222
    invoke-direct {v5, v4, v2}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;-><init>(ILsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    :goto_4
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    if-eqz v0, :cond_9

    .line 233
    .line 234
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-eqz v2, :cond_9

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-eqz v2, :cond_b

    .line 250
    .line 251
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    check-cast v2, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 256
    .line 257
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->e()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    const-string v5, "dns"

    .line 262
    .line 263
    invoke-static {v4, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-eqz v4, :cond_a

    .line 268
    .line 269
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->k()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    const-string v4, "dns-out"

    .line 274
    .line 275
    invoke-static {v2, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    if-eqz v2, :cond_a

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_b
    :goto_5
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    new-instance v4, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 287
    .line 288
    const-string v5, "dns-out"

    .line 289
    .line 290
    const-string v6, "dns"

    .line 291
    .line 292
    const/4 v8, 0x0

    .line 293
    const/16 v9, 0x30

    .line 294
    .line 295
    const/4 v7, 0x0

    .line 296
    invoke-direct/range {v4 .. v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;-><init>(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    :goto_6
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->b()Ljava/util/ArrayList;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    filled-new-array {v3}, [Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-static {v0}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    new-instance v2, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;

    .line 319
    .line 320
    const-string v4, "dns-out"

    .line 321
    .line 322
    const/4 v6, 0x0

    .line 323
    const/16 v8, 0x3bf9

    .line 324
    .line 325
    const/4 v3, 0x0

    .line 326
    const/4 v5, 0x0

    .line 327
    invoke-direct/range {v2 .. v8}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 331
    .line 332
    .line 333
    goto :goto_7

    .line 334
    :catchall_0
    move-exception v0

    .line 335
    move-object p0, v0

    .line 336
    nop

    .line 337
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 338
    .line 339
    if-nez v0, :cond_c

    .line 340
    .line 341
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 342
    .line 343
    if-nez v0, :cond_c

    .line 344
    .line 345
    :goto_7
    return-void

    .line 346
    :cond_c
    throw p0
.end method

.method public static e(Lsu/happ/proxyutility/dto/XRayConfig;)V
    .locals 18

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ld69;->j()Lmn6;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v2}, Lmn6;->k(Lmn6;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v2, v3

    .line 34
    :goto_0
    sget-object v4, Lss8;->a:Lss8;

    .line 35
    .line 36
    invoke-static {}, Lss8;->o()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {}, Lss8;->i()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    new-instance v6, Lz59;

    .line 45
    .line 46
    invoke-direct {v6, v4, v2, v1}, Lz59;-><init>(Ljava/util/List;Lsu/happ/proxyutility/dto/RouteSettings;Ljava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    new-instance v7, Lz59;

    .line 50
    .line 51
    invoke-direct {v7, v2, v1, v5}, Lz59;-><init>(Lsu/happ/proxyutility/dto/RouteSettings;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v9, 0x1

    .line 56
    if-eqz v2, :cond_b

    .line 57
    .line 58
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->A()Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    sget-object v11, Lc69;->e:[I

    .line 63
    .line 64
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    aget v10, v11, v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    const/16 v12, 0x7a

    .line 71
    .line 72
    const-string v13, "pref_run_without_routing"

    .line 73
    .line 74
    if-ne v10, v9, :cond_5

    .line 75
    .line 76
    :try_start_1
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->y()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-nez v10, :cond_1

    .line 85
    .line 86
    const-string v6, "https://cloudflare-dns.com/dns-query"

    .line 87
    .line 88
    :cond_1
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->x()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v14

    .line 99
    if-nez v14, :cond_2

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    move-object v10, v3

    .line 103
    :goto_1
    if-eqz v10, :cond_4

    .line 104
    .line 105
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 106
    .line 107
    .line 108
    move-result-object v14

    .line 109
    if-eqz v14, :cond_3

    .line 110
    .line 111
    invoke-virtual {v14, v13, v8}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    if-ne v14, v9, :cond_3

    .line 116
    .line 117
    move-object v10, v3

    .line 118
    :cond_3
    if-eqz v10, :cond_4

    .line 119
    .line 120
    new-instance v14, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean$ServersBean;

    .line 121
    .line 122
    invoke-direct {v14, v6, v3, v10, v12}, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean$ServersBean;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    new-instance v10, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean$ServersBean;

    .line 130
    .line 131
    new-instance v14, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-direct {v10, v6, v3, v14, v12}, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean$ServersBean;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    invoke-virtual {v6}, Lz59;->invoke()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :goto_2
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->p()Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    aget v6, v11, v6

    .line 155
    .line 156
    if-ne v6, v9, :cond_a

    .line 157
    .line 158
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->n()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-nez v7, :cond_6

    .line 167
    .line 168
    const-string v6, "https://dns.google/dns-query"

    .line 169
    .line 170
    :cond_6
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->k()Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    if-nez v10, :cond_7

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_7
    move-object v7, v3

    .line 182
    :goto_3
    if-eqz v7, :cond_9

    .line 183
    .line 184
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    if-eqz v10, :cond_8

    .line 189
    .line 190
    invoke-virtual {v10, v13, v8}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    if-ne v10, v9, :cond_8

    .line 195
    .line 196
    move-object v7, v3

    .line 197
    :cond_8
    if-eqz v7, :cond_9

    .line 198
    .line 199
    new-instance v10, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean$ServersBean;

    .line 200
    .line 201
    invoke-direct {v10, v6, v3, v7, v12}, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean$ServersBean;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_9
    new-instance v7, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean$ServersBean;

    .line 209
    .line 210
    new-instance v10, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-direct {v7, v6, v3, v10, v12}, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean$ServersBean;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_a
    invoke-virtual {v7}, Lz59;->invoke()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_b
    invoke-virtual {v6}, Lz59;->invoke()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v7}, Lz59;->invoke()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    :goto_4
    if-eqz v2, :cond_11

    .line 233
    .line 234
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->A()Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    sget-object v7, Lc69;->e:[I

    .line 239
    .line 240
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    aget v6, v7, v6

    .line 245
    .line 246
    if-ne v6, v9, :cond_e

    .line 247
    .line 248
    new-instance v6, Ljava/net/URL;

    .line 249
    .line 250
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->y()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    invoke-direct {v6, v10}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v6}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    if-eqz v6, :cond_c

    .line 262
    .line 263
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    if-nez v10, :cond_d

    .line 268
    .line 269
    :cond_c
    move-object v6, v3

    .line 270
    :cond_d
    if-eqz v6, :cond_e

    .line 271
    .line 272
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->z()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    invoke-interface {v0, v6, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    :cond_e
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->p()Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    aget v6, v7, v6

    .line 288
    .line 289
    if-ne v6, v9, :cond_11

    .line 290
    .line 291
    new-instance v6, Ljava/net/URL;

    .line 292
    .line 293
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->n()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    invoke-direct {v6, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v6}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v6

    .line 304
    if-eqz v6, :cond_f

    .line 305
    .line 306
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    if-nez v7, :cond_10

    .line 311
    .line 312
    :cond_f
    move-object v6, v3

    .line 313
    :cond_10
    if-eqz v6, :cond_11

    .line 314
    .line 315
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->o()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    :cond_11
    const-string v6, "domain:googleapis.cn"

    .line 323
    .line 324
    const-string v7, "googleapis.com"

    .line 325
    .line 326
    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    if-eqz v2, :cond_12

    .line 330
    .line 331
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->l()Ljava/util/Map;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    if-eqz v6, :cond_12

    .line 336
    .line 337
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v7

    .line 349
    if-eqz v7, :cond_12

    .line 350
    .line 351
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    check-cast v7, Ljava/util/Map$Entry;

    .line 356
    .line 357
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v10

    .line 361
    check-cast v10, Ljava/lang/String;

    .line 362
    .line 363
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    invoke-interface {v0, v10, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    goto :goto_5

    .line 371
    :cond_12
    sget-object v6, Lsu/happ/proxyutility/dto/enums/EIpType;->Companion:Lsu/happ/proxyutility/dto/enums/EIpType$Companion;

    .line 372
    .line 373
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    const-string v10, "pref_ip_type"

    .line 378
    .line 379
    invoke-virtual {v7, v10}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v7

    .line 383
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-static {v7}, Lsu/happ/proxyutility/dto/enums/EIpType$Companion;->a(Ljava/lang/String;)Lsu/happ/proxyutility/dto/enums/EIpType;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    sget-object v7, Lc69;->b:[I

    .line 391
    .line 392
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    aget v6, v7, v6

    .line 397
    .line 398
    if-eq v6, v9, :cond_15

    .line 399
    .line 400
    const/4 v7, 0x2

    .line 401
    if-eq v6, v7, :cond_14

    .line 402
    .line 403
    const/4 v7, 0x3

    .line 404
    if-ne v6, v7, :cond_13

    .line 405
    .line 406
    sget-object v6, Lsu/happ/proxyutility/dto/enums/EIpType;->AUTO:Lsu/happ/proxyutility/dto/enums/EIpType;

    .line 407
    .line 408
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/enums/EIpType;->b()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    goto :goto_6

    .line 413
    :cond_13
    new-instance v0, Lb55;

    .line 414
    .line 415
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 416
    .line 417
    .line 418
    throw v0

    .line 419
    :cond_14
    sget-object v6, Lsu/happ/proxyutility/dto/enums/EIpType;->IPv6:Lsu/happ/proxyutility/dto/enums/EIpType;

    .line 420
    .line 421
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/enums/EIpType;->b()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    goto :goto_6

    .line 426
    :cond_15
    sget-object v6, Lsu/happ/proxyutility/dto/enums/EIpType;->IPv4:Lsu/happ/proxyutility/dto/enums/EIpType;

    .line 427
    .line 428
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/enums/EIpType;->b()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    :goto_6
    new-instance v7, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;

    .line 433
    .line 434
    invoke-direct {v7, v1, v0, v6}, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;-><init>(Ljava/util/ArrayList;Ljava/util/Map;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    move-object/from16 v0, p0

    .line 438
    .line 439
    invoke-virtual {v0, v7}, Lsu/happ/proxyutility/dto/XRayConfig;->o(Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;)V

    .line 440
    .line 441
    .line 442
    sget-object v1, Lss8;->a:Lss8;

    .line 443
    .line 444
    invoke-static {v5}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    check-cast v1, Ljava/lang/String;

    .line 449
    .line 450
    invoke-static {v1}, Lss8;->y(Ljava/lang/String;)Z

    .line 451
    .line 452
    .line 453
    move-result v1

    .line 454
    const/16 v6, 0x35

    .line 455
    .line 456
    const/16 v7, 0x1bb

    .line 457
    .line 458
    if-eqz v1, :cond_18

    .line 459
    .line 460
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->b()Ljava/util/ArrayList;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    if-eqz v2, :cond_16

    .line 469
    .line 470
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->p()Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 471
    .line 472
    .line 473
    move-result-object v10

    .line 474
    goto :goto_7

    .line 475
    :cond_16
    move-object v10, v3

    .line 476
    :goto_7
    sget-object v11, Lsu/happ/proxyutility/dto/enums/EDnsType;->DOH:Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 477
    .line 478
    if-ne v10, v11, :cond_17

    .line 479
    .line 480
    move v10, v7

    .line 481
    goto :goto_8

    .line 482
    :cond_17
    move v10, v6

    .line 483
    :goto_8
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v14

    .line 487
    new-array v10, v9, [Ljava/lang/String;

    .line 488
    .line 489
    invoke-static {v5}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v5

    .line 493
    aput-object v5, v10, v8

    .line 494
    .line 495
    invoke-static {v10}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 496
    .line 497
    .line 498
    move-result-object v12

    .line 499
    new-instance v11, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;

    .line 500
    .line 501
    const-string v13, "direct"

    .line 502
    .line 503
    const/16 v16, 0x0

    .line 504
    .line 505
    const/16 v17, 0x3fe8

    .line 506
    .line 507
    const/4 v15, 0x0

    .line 508
    invoke-direct/range {v11 .. v17}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1, v8, v11}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    :cond_18
    invoke-static {v4}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    check-cast v1, Ljava/lang/String;

    .line 519
    .line 520
    invoke-static {v1}, Lss8;->y(Ljava/lang/String;)Z

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    if-eqz v1, :cond_1b

    .line 525
    .line 526
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->b()Ljava/util/ArrayList;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    if-eqz v2, :cond_19

    .line 535
    .line 536
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->A()Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    :cond_19
    sget-object v1, Lsu/happ/proxyutility/dto/enums/EDnsType;->DOH:Lsu/happ/proxyutility/dto/enums/EDnsType;

    .line 541
    .line 542
    if-ne v3, v1, :cond_1a

    .line 543
    .line 544
    move v6, v7

    .line 545
    :cond_1a
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v13

    .line 549
    new-array v1, v9, [Ljava/lang/String;

    .line 550
    .line 551
    invoke-static {v4}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    aput-object v2, v1, v8

    .line 556
    .line 557
    invoke-static {v1}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 558
    .line 559
    .line 560
    move-result-object v11

    .line 561
    new-instance v10, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;

    .line 562
    .line 563
    const-string v12, "proxy"

    .line 564
    .line 565
    const/4 v15, 0x0

    .line 566
    const/16 v16, 0x3fe8

    .line 567
    .line 568
    const/4 v14, 0x0

    .line 569
    invoke-direct/range {v10 .. v16}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0, v8, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 573
    .line 574
    .line 575
    goto :goto_9

    .line 576
    :catchall_0
    move-exception v0

    .line 577
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 578
    .line 579
    if-nez v1, :cond_1c

    .line 580
    .line 581
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 582
    .line 583
    if-nez v1, :cond_1c

    .line 584
    .line 585
    :cond_1b
    :goto_9
    return-void

    .line 586
    :cond_1c
    throw v0
.end method

.method public static f(Lsu/happ/proxyutility/dto/XRayConfig;)V
    .locals 5

    .line 1
    invoke-static {}, Ld69;->j()Lmn6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lmn6;->k(Lmn6;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->q()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "pref_local_dns_enabled"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Lcom/tencent/mmkv/MMKV;->b(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    if-eqz v0, :cond_5

    .line 42
    .line 43
    :cond_1
    new-instance v0, Lsu/happ/proxyutility/dto/XRayConfig$FakednsBean;

    .line 44
    .line 45
    invoke-direct {v0}, Lsu/happ/proxyutility/dto/XRayConfig$FakednsBean;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0, v0}, Lsu/happ/proxyutility/dto/XRayConfig;->p(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    move-object v2, v1

    .line 79
    check-cast v2, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 80
    .line 81
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->e()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-string v4, "freedom"

    .line 86
    .line 87
    invoke-static {v3, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_2

    .line 92
    .line 93
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->k()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const-string v3, "direct"

    .line 98
    .line 99
    invoke-static {v2, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_2

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 124
    .line 125
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->n()V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    return-void
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, Ld69;->e:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/CharSequence;

    .line 28
    .line 29
    invoke-static {p0, v2, v0}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    :goto_0
    return v0
.end method

.method public static h(Landroid/content/Context;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/HashMap;)Lb69;
    .locals 18

    .line 1
    const-string v1, ""

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    new-instance v0, Lb69;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-boolean v2, v0, Lb69;->a:Z

    .line 13
    .line 14
    iput-object v1, v0, Lb69;->b:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    move-object/from16 v4, p0

    .line 18
    .line 19
    invoke-static {v4, v3}, Ld69;->q(Landroid/content/Context;Z)Lsu/happ/proxyutility/dto/XRayConfig;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    sget-object v5, Lsu/happ/proxyutility/domain/sub/GuId;->Companion:Lwu2;

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/GuId;->a()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static {v4, v5, v2}, Ld69;->r(Lsu/happ/proxyutility/dto/XRayConfig;Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    new-instance v6, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 39
    .line 40
    const-string v7, "fragment"

    .line 41
    .line 42
    const-string v8, "freedom"

    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    const/16 v11, 0x3c

    .line 46
    .line 47
    const/4 v9, 0x0

    .line 48
    invoke-direct/range {v6 .. v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;-><init>(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;I)V

    .line 49
    .line 50
    .line 51
    new-instance v5, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 52
    .line 53
    const v7, 0x1fffbff

    .line 54
    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    invoke-direct {v5, v8, v8, v7}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;-><init>(Ljava/util/List;Ljava/util/List;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->o(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;)V

    .line 61
    .line 62
    .line 63
    new-instance v5, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;

    .line 64
    .line 65
    const/16 v7, 0xee

    .line 66
    .line 67
    invoke-direct {v5, v7}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;-><init>(I)V

    .line 68
    .line 69
    .line 70
    new-instance v7, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 71
    .line 72
    new-instance v9, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;

    .line 73
    .line 74
    move-object/from16 v10, p1

    .line 75
    .line 76
    invoke-direct {v9, v10}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;-><init>(Ljava/util/LinkedHashMap;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v9}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    new-instance v10, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;

    .line 84
    .line 85
    const-string v11, "noise"

    .line 86
    .line 87
    const/16 v16, 0x0

    .line 88
    .line 89
    const/16 v17, 0x1ef

    .line 90
    .line 91
    const/4 v12, 0x0

    .line 92
    const/4 v13, 0x0

    .line 93
    const/4 v15, 0x0

    .line 94
    move-object/from16 v14, p2

    .line 95
    .line 96
    invoke-static/range {v12 .. v17}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean$UdpMaskSettingBean;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)Ljava/util/LinkedHashMap;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    invoke-direct {v10, v11, v12}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v10}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    const/4 v11, 0x4

    .line 108
    invoke-direct {v7, v9, v10, v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;-><init>(Ljava/util/List;Ljava/util/List;I)V

    .line 109
    .line 110
    .line 111
    new-instance v9, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 112
    .line 113
    const/16 v10, 0x17ff

    .line 114
    .line 115
    invoke-direct {v9, v8, v7, v5, v10}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;-><init>(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->p(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v5, v2, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-static {v4, v3}, Ld69;->p(Lsu/happ/proxyutility/dto/XRayConfig;Z)Z

    .line 129
    .line 130
    .line 131
    new-instance v5, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-eqz v7, :cond_2

    .line 149
    .line 150
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    check-cast v7, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 155
    .line 156
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->b()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    const-string v9, "socks"

    .line 161
    .line 162
    invoke-static {v8, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-eqz v8, :cond_1

    .line 167
    .line 168
    sget-object v8, Ln67;->a:Lvz7;

    .line 169
    .line 170
    sget-object v8, Lss8;->a:Lss8;

    .line 171
    .line 172
    invoke-static {}, Ln67;->c()Lcom/tencent/mmkv/MMKV;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    const-string v9, "pref_fronting_socks_port"

    .line 177
    .line 178
    invoke-virtual {v8, v9}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    const-string v9, "10811"

    .line 183
    .line 184
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    invoke-static {v9, v8}, Lss8;->C(ILjava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    invoke-virtual {v7, v8}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->g(I)V

    .line 193
    .line 194
    .line 195
    goto :goto_0

    .line 196
    :catchall_0
    move-exception v0

    .line 197
    goto/16 :goto_3

    .line 198
    .line 199
    :cond_1
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    if-eqz v6, :cond_3

    .line 212
    .line 213
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    check-cast v6, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 218
    .line 219
    invoke-virtual {v4}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_3
    sget-object v5, Lsu/happ/proxyutility/dto/enums/EIpType;->Companion:Lsu/happ/proxyutility/dto/enums/EIpType$Companion;

    .line 228
    .line 229
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    const-string v7, "pref_ip_type"

    .line 234
    .line 235
    invoke-virtual {v6, v7}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-static {v6}, Lsu/happ/proxyutility/dto/enums/EIpType$Companion;->a(Ljava/lang/String;)Lsu/happ/proxyutility/dto/enums/EIpType;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    sget-object v6, Lc69;->b:[I

    .line 247
    .line 248
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    aget v5, v6, v5

    .line 253
    .line 254
    if-eq v5, v3, :cond_6

    .line 255
    .line 256
    const/4 v6, 0x2

    .line 257
    if-eq v5, v6, :cond_5

    .line 258
    .line 259
    const/4 v6, 0x3

    .line 260
    if-ne v5, v6, :cond_4

    .line 261
    .line 262
    sget-object v5, Lsu/happ/proxyutility/dto/enums/EIpType;->AUTO:Lsu/happ/proxyutility/dto/enums/EIpType;

    .line 263
    .line 264
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/enums/EIpType;->b()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    goto :goto_2

    .line 269
    :cond_4
    new-instance v0, Lb55;

    .line 270
    .line 271
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 272
    .line 273
    .line 274
    throw v0

    .line 275
    :cond_5
    sget-object v5, Lsu/happ/proxyutility/dto/enums/EIpType;->IPv6:Lsu/happ/proxyutility/dto/enums/EIpType;

    .line 276
    .line 277
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/enums/EIpType;->b()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    goto :goto_2

    .line 282
    :cond_6
    sget-object v5, Lsu/happ/proxyutility/dto/enums/EIpType;->IPv4:Lsu/happ/proxyutility/dto/enums/EIpType;

    .line 283
    .line 284
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/enums/EIpType;->b()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    :goto_2
    new-instance v6, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;

    .line 289
    .line 290
    const-string v7, "localhost"

    .line 291
    .line 292
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    invoke-static {v7}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    move-object/from16 v8, p3

    .line 301
    .line 302
    invoke-direct {v6, v7, v8, v5}, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;-><init>(Ljava/util/ArrayList;Ljava/util/Map;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v4, v6}, Lsu/happ/proxyutility/dto/XRayConfig;->o(Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;)V

    .line 306
    .line 307
    .line 308
    invoke-static {v4}, Ld69;->b(Lsu/happ/proxyutility/dto/XRayConfig;)V

    .line 309
    .line 310
    .line 311
    iput-boolean v3, v0, Lb69;->a:Z

    .line 312
    .line 313
    sget-object v3, Lyw2;->d:Lcom/google/gson/a;

    .line 314
    .line 315
    invoke-virtual {v3, v4}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    iput-object v3, v0, Lb69;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 320
    .line 321
    goto :goto_4

    .line 322
    :goto_3
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 323
    .line 324
    if-nez v3, :cond_8

    .line 325
    .line 326
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 327
    .line 328
    if-nez v3, :cond_8

    .line 329
    .line 330
    new-instance v3, Lrj6;

    .line 331
    .line 332
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 333
    .line 334
    .line 335
    move-object v0, v3

    .line 336
    :goto_4
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    if-nez v3, :cond_7

    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_7
    new-instance v0, Lb69;

    .line 344
    .line 345
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 346
    .line 347
    .line 348
    iput-boolean v2, v0, Lb69;->a:Z

    .line 349
    .line 350
    iput-object v1, v0, Lb69;->b:Ljava/lang/String;

    .line 351
    .line 352
    :goto_5
    check-cast v0, Lb69;

    .line 353
    .line 354
    return-object v0

    .line 355
    :cond_8
    throw v0
.end method

.method public static i()Lkf4;
    .locals 1

    .line 1
    sget-object v0, Ld69;->c:Lvz7;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lkf4;

    .line 8
    .line 9
    return-object v0
.end method

.method public static j()Lmn6;
    .locals 1

    .line 1
    sget-object v0, Ld69;->d:Lvz7;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lmn6;

    .line 8
    .line 9
    return-object v0
.end method

.method public static k()Lcom/tencent/mmkv/MMKV;
    .locals 1

    .line 1
    sget-object v0, Ld69;->b:Lvz7;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 8
    .line 9
    return-object v0
.end method

.method public static l(Landroid/content/Context;Ljava/lang/String;ZI)Lb69;
    .locals 9

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    and-int/lit8 v1, p3, 0x4

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    move v6, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v6, p2

    .line 11
    :goto_0
    and-int/lit8 p2, p3, 0x8

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    move v8, v2

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 p2, 0x1

    .line 18
    move v8, p2

    .line 19
    :goto_1
    and-int/lit8 p2, p3, 0x10

    .line 20
    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    :cond_2
    const-string p2, ""

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-static {}, Ld69;->j()Lmn6;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    invoke-virtual {p3}, Lmn6;->v()V

    .line 37
    .line 38
    .line 39
    sget-object p3, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 40
    .line 41
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    iget-object p3, p3, Lsu/happ/proxyutility/HappApplication;->s0:Lvz7;

    .line 46
    .line 47
    invoke-virtual {p3}, Lvz7;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    check-cast p3, Lu42;

    .line 52
    .line 53
    invoke-virtual {p3}, Lu42;->b()V

    .line 54
    .line 55
    .line 56
    sget-object p3, Lkw4;->a:Lkw4;

    .line 57
    .line 58
    invoke-static {p1}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    if-nez p3, :cond_3

    .line 63
    .line 64
    new-instance p0, Lb69;

    .line 65
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-boolean v2, p0, Lb69;->a:Z

    .line 70
    .line 71
    iput-object p2, p0, Lb69;->b:Ljava/lang/String;

    .line 72
    .line 73
    return-object p0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object p0, v0

    .line 76
    goto :goto_3

    .line 77
    :cond_3
    invoke-virtual {p3}, Lsu/happ/proxyutility/dto/ServerConfig;->c()Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sget-object v3, Lsu/happ/proxyutility/dto/enums/EConfigType;->CUSTOM:Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 82
    .line 83
    if-eq v1, v3, :cond_5

    .line 84
    .line 85
    invoke-virtual {p3}, Lsu/happ/proxyutility/dto/ServerConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    if-nez v4, :cond_4

    .line 90
    .line 91
    new-instance p0, Lb69;

    .line 92
    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-boolean v2, p0, Lb69;->a:Z

    .line 97
    .line 98
    iput-object p2, p0, Lb69;->b:Ljava/lang/String;

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_4
    invoke-virtual {p3}, Lsu/happ/proxyutility/dto/ServerConfig;->h()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    move-object v3, p0

    .line 106
    move-object v7, p1

    .line 107
    invoke-static/range {v3 .. v8}, Ld69;->n(Landroid/content/Context;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;Ljava/lang/String;ZLjava/lang/String;Z)Lb69;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :cond_5
    move-object v3, p0

    .line 113
    move-object v7, p1

    .line 114
    if-eqz v0, :cond_6

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    goto :goto_2

    .line 121
    :cond_6
    move p0, v8

    .line 122
    :goto_2
    invoke-static {v3, v7, p3, p0, v8}, Ld69;->m(Landroid/content/Context;Ljava/lang/String;Lsu/happ/proxyutility/dto/ServerConfig;ZZ)Lb69;

    .line 123
    .line 124
    .line 125
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    return-object p0

    .line 127
    :goto_3
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 128
    .line 129
    if-nez p1, :cond_8

    .line 130
    .line 131
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 132
    .line 133
    if-nez p1, :cond_8

    .line 134
    .line 135
    new-instance p1, Lrj6;

    .line 136
    .line 137
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    invoke-static {p1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    if-nez p0, :cond_7

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_7
    new-instance p1, Lb69;

    .line 148
    .line 149
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-boolean v2, p1, Lb69;->a:Z

    .line 153
    .line 154
    iput-object p2, p1, Lb69;->b:Ljava/lang/String;

    .line 155
    .line 156
    :goto_4
    check-cast p1, Lb69;

    .line 157
    .line 158
    return-object p1

    .line 159
    :cond_8
    throw p0
.end method

.method public static m(Landroid/content/Context;Ljava/lang/String;Lsu/happ/proxyutility/dto/ServerConfig;ZZ)Lb69;
    .locals 31

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, Ld69;->a:Lvz7;

    .line 4
    .line 5
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/tencent/mmkv/MMKV;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-class v2, Lbq3;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const-string v4, "rules"

    .line 19
    .line 20
    const-string v5, "routing"

    .line 21
    .line 22
    const/4 v6, 0x1

    .line 23
    const-string v7, ""

    .line 24
    .line 25
    if-eqz v1, :cond_a

    .line 26
    .line 27
    invoke-static {v1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v9

    .line 31
    if-eqz v9, :cond_0

    .line 32
    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_0
    sget-object v9, Lyw2;->c:Lcom/google/gson/a;

    .line 36
    .line 37
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v10, Lyi8;

    .line 41
    .line 42
    invoke-direct {v10, v2}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v9, v1, v10}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lbq3;

    .line 50
    .line 51
    if-eqz p3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    const-string v10, "geodata"

    .line 57
    .line 58
    invoke-static {v1, v10}, Li21;->R(Lbq3;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    const-string v10, "log"

    .line 62
    .line 63
    const-string v11, "error"

    .line 64
    .line 65
    const-string v12, "access"

    .line 66
    .line 67
    if-nez p4, :cond_7

    .line 68
    .line 69
    invoke-static {}, Ld69;->i()Lkf4;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    invoke-virtual {v13}, Lkf4;->d()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v13

    .line 77
    invoke-static {}, Ld69;->i()Lkf4;

    .line 78
    .line 79
    .line 80
    move-result-object v14

    .line 81
    invoke-virtual {v14, v0}, Lkf4;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v1, v10}, Lbq3;->l(Ljava/lang/String;)Lbq3;

    .line 86
    .line 87
    .line 88
    move-result-object v14

    .line 89
    if-eqz v14, :cond_4

    .line 90
    .line 91
    invoke-static {v14, v12}, Li21;->R(Lbq3;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    if-eqz v13, :cond_2

    .line 95
    .line 96
    invoke-virtual {v14, v12, v13}, Lbq3;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-static {v14, v11}, Li21;->R(Lbq3;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    if-eqz v0, :cond_3

    .line 103
    .line 104
    invoke-virtual {v14, v11, v0}, Lbq3;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sget-object v14, Ldn8;->a:Ldn8;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    const/4 v14, 0x0

    .line 111
    :goto_0
    if-nez v14, :cond_8

    .line 112
    .line 113
    :cond_4
    new-instance v14, Lbq3;

    .line 114
    .line 115
    invoke-direct {v14}, Lbq3;-><init>()V

    .line 116
    .line 117
    .line 118
    if-eqz v13, :cond_5

    .line 119
    .line 120
    invoke-virtual {v14, v12, v13}, Lbq3;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    if-eqz v0, :cond_6

    .line 124
    .line 125
    invoke-virtual {v14, v11, v0}, Lbq3;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_6
    invoke-virtual {v1, v10, v14}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_7
    invoke-virtual {v1, v10}, Lbq3;->l(Ljava/lang/String;)Lbq3;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    if-eqz v0, :cond_8

    .line 137
    .line 138
    invoke-static {v0, v12}, Li21;->R(Lbq3;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v0, v11}, Li21;->R(Lbq3;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_8
    :goto_1
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const-string v10, "pref_run_without_routing"

    .line 149
    .line 150
    invoke-virtual {v0, v10, v3}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_9

    .line 155
    .line 156
    new-instance v11, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;

    .line 157
    .line 158
    const/16 v16, 0x0

    .line 159
    .line 160
    const/16 v17, 0x3fff

    .line 161
    .line 162
    const/4 v12, 0x0

    .line 163
    const/4 v13, 0x0

    .line 164
    const/4 v14, 0x0

    .line 165
    const/4 v15, 0x0

    .line 166
    invoke-direct/range {v11 .. v17}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V

    .line 167
    .line 168
    .line 169
    new-instance v12, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;

    .line 170
    .line 171
    const/16 v17, 0x0

    .line 172
    .line 173
    const/16 v18, 0x3fff

    .line 174
    .line 175
    invoke-direct/range {v12 .. v18}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V

    .line 176
    .line 177
    .line 178
    const-string v0, "1.1.1.1"

    .line 179
    .line 180
    filled-new-array {v0}, [Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v13

    .line 184
    invoke-static {v13}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    invoke-virtual {v11, v13}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->f(Ljava/util/ArrayList;)V

    .line 189
    .line 190
    .line 191
    const-string v13, "proxy"

    .line 192
    .line 193
    invoke-virtual {v11, v13}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->g(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->h()V

    .line 197
    .line 198
    .line 199
    const-string v13, "8.8.8.8"

    .line 200
    .line 201
    filled-new-array {v13}, [Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    invoke-static {v14}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 206
    .line 207
    .line 208
    move-result-object v14

    .line 209
    invoke-virtual {v12, v14}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->f(Ljava/util/ArrayList;)V

    .line 210
    .line 211
    .line 212
    const-string v14, "direct"

    .line 213
    .line 214
    invoke-virtual {v12, v14}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->g(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;->h()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v5}, Lbq3;->l(Ljava/lang/String;)Lbq3;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    filled-new-array {v11, v12}, [Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    invoke-static {v11}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    invoke-virtual {v9, v11}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    new-instance v12, Lyi8;

    .line 237
    .line 238
    const-class v15, Lbo3;

    .line 239
    .line 240
    invoke-direct {v12, v15}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v9, v11, v12}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    check-cast v11, Lbo3;

    .line 248
    .line 249
    invoke-virtual {v14, v4, v11}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 250
    .line 251
    .line 252
    const-string v11, "dns"

    .line 253
    .line 254
    invoke-virtual {v1, v11}, Lbq3;->l(Ljava/lang/String;)Lbq3;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    filled-new-array {v0, v13}, [Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-static {v0}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v9, v0}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    new-instance v12, Lyi8;

    .line 271
    .line 272
    invoke-direct {v12, v15}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v9, v0, v12}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    check-cast v0, Lbo3;

    .line 280
    .line 281
    const-string v9, "servers"

    .line 282
    .line 283
    invoke-virtual {v11, v9, v0}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 284
    .line 285
    .line 286
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v0, v10, v3}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 291
    .line 292
    .line 293
    :cond_9
    invoke-virtual {v1}, Lbo3;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    goto :goto_4

    .line 298
    :cond_a
    :goto_2
    invoke-virtual/range {p2 .. p2}, Lsu/happ/proxyutility/dto/ServerConfig;->d()Lsu/happ/proxyutility/dto/XRayConfig;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    if-eqz v1, :cond_43

    .line 303
    .line 304
    if-nez p4, :cond_d

    .line 305
    .line 306
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$LogBean;

    .line 307
    .line 308
    .line 309
    move-result-object v9

    .line 310
    invoke-static {}, Ld69;->i()Lkf4;

    .line 311
    .line 312
    .line 313
    move-result-object v10

    .line 314
    invoke-virtual {v10}, Lkf4;->d()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    if-nez v10, :cond_b

    .line 319
    .line 320
    move-object v10, v7

    .line 321
    :cond_b
    invoke-virtual {v9, v10}, Lsu/happ/proxyutility/dto/XRayConfig$LogBean;->a(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$LogBean;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    invoke-static {}, Ld69;->i()Lkf4;

    .line 329
    .line 330
    .line 331
    move-result-object v10

    .line 332
    invoke-virtual {v10, v0}, Lkf4;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    if-nez v0, :cond_c

    .line 337
    .line 338
    move-object v0, v7

    .line 339
    :cond_c
    invoke-virtual {v9, v0}, Lsu/happ/proxyutility/dto/XRayConfig$LogBean;->b(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    goto :goto_3

    .line 343
    :cond_d
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$LogBean;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {v0, v7}, Lsu/happ/proxyutility/dto/XRayConfig$LogBean;->a(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$LogBean;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-virtual {v0, v7}, Lsu/happ/proxyutility/dto/XRayConfig$LogBean;->b(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    :goto_3
    invoke-static {v1, v6}, Ld69;->o(Lsu/happ/proxyutility/dto/XRayConfig;Z)V

    .line 358
    .line 359
    .line 360
    sget-object v0, Lyw2;->d:Lcom/google/gson/a;

    .line 361
    .line 362
    invoke-virtual {v0, v1}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    :goto_4
    if-eqz p4, :cond_e

    .line 367
    .line 368
    new-instance v1, Lb69;

    .line 369
    .line 370
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 371
    .line 372
    .line 373
    iput-boolean v6, v1, Lb69;->a:Z

    .line 374
    .line 375
    iput-object v0, v1, Lb69;->b:Ljava/lang/String;

    .line 376
    .line 377
    return-object v1

    .line 378
    :cond_e
    sget-object v1, Lyw2;->c:Lcom/google/gson/a;

    .line 379
    .line 380
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    new-instance v9, Lyi8;

    .line 384
    .line 385
    invoke-direct {v9, v2}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1, v0, v9}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    move-object v1, v0

    .line 393
    check-cast v1, Lbq3;

    .line 394
    .line 395
    const-string v2, "inbounds"

    .line 396
    .line 397
    invoke-virtual {v1, v2}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    iget-object v9, v1, Lbq3;->X:Lya4;

    .line 402
    .line 403
    if-eqz v0, :cond_f

    .line 404
    .line 405
    instance-of v0, v0, Lxp3;

    .line 406
    .line 407
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    goto :goto_5

    .line 412
    :cond_f
    const/4 v0, 0x0

    .line 413
    :goto_5
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 414
    .line 415
    invoke-static {v0, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    if-eqz v0, :cond_10

    .line 420
    .line 421
    invoke-virtual {v9, v2}, Lya4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    check-cast v0, Len3;

    .line 426
    .line 427
    :goto_6
    move-object v11, v0

    .line 428
    goto :goto_7

    .line 429
    :cond_10
    new-instance v0, Len3;

    .line 430
    .line 431
    invoke-direct {v0}, Len3;-><init>()V

    .line 432
    .line 433
    .line 434
    goto :goto_6

    .line 435
    :goto_7
    const-string v12, "outbounds"

    .line 436
    .line 437
    invoke-virtual {v1, v12}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    if-eqz v0, :cond_11

    .line 442
    .line 443
    instance-of v0, v0, Lxp3;

    .line 444
    .line 445
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    goto :goto_8

    .line 450
    :cond_11
    const/4 v0, 0x0

    .line 451
    :goto_8
    invoke-static {v0, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    if-eqz v0, :cond_12

    .line 456
    .line 457
    invoke-virtual {v9, v12}, Lya4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    check-cast v0, Len3;

    .line 462
    .line 463
    :goto_9
    move-object v9, v0

    .line 464
    goto :goto_a

    .line 465
    :cond_12
    new-instance v0, Len3;

    .line 466
    .line 467
    invoke-direct {v0}, Len3;-><init>()V

    .line 468
    .line 469
    .line 470
    goto :goto_9

    .line 471
    :goto_a
    invoke-virtual {v1, v5}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    if-eqz v0, :cond_13

    .line 476
    .line 477
    instance-of v0, v0, Lxp3;

    .line 478
    .line 479
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    goto :goto_b

    .line 484
    :cond_13
    const/4 v0, 0x0

    .line 485
    :goto_b
    invoke-static {v0, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    if-eqz v0, :cond_14

    .line 490
    .line 491
    invoke-virtual {v1, v5}, Lbq3;->l(Ljava/lang/String;)Lbq3;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    :goto_c
    move-object v13, v0

    .line 496
    goto :goto_d

    .line 497
    :cond_14
    new-instance v0, Lbq3;

    .line 498
    .line 499
    invoke-direct {v0}, Lbq3;-><init>()V

    .line 500
    .line 501
    .line 502
    goto :goto_c

    .line 503
    :goto_d
    invoke-virtual {v13, v4}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    if-eqz v0, :cond_15

    .line 508
    .line 509
    instance-of v0, v0, Lxp3;

    .line 510
    .line 511
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    goto :goto_e

    .line 516
    :cond_15
    const/4 v0, 0x0

    .line 517
    :goto_e
    invoke-static {v0, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    if-eqz v0, :cond_16

    .line 522
    .line 523
    iget-object v0, v13, Lbq3;->X:Lya4;

    .line 524
    .line 525
    invoke-virtual {v0, v4}, Lya4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    check-cast v0, Len3;

    .line 530
    .line 531
    :goto_f
    move-object v10, v0

    .line 532
    goto :goto_10

    .line 533
    :cond_16
    new-instance v0, Len3;

    .line 534
    .line 535
    invoke-direct {v0}, Len3;-><init>()V

    .line 536
    .line 537
    .line 538
    goto :goto_f

    .line 539
    :goto_10
    invoke-static {}, Ln67;->c()Lcom/tencent/mmkv/MMKV;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    const-string v14, "pref_proxy_sharing_enabled"

    .line 544
    .line 545
    invoke-virtual {v0, v14, v3}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    if-eqz v0, :cond_18

    .line 550
    .line 551
    :try_start_0
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    new-instance v0, Lhu;

    .line 555
    .line 556
    invoke-direct {v0, v11, v6}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 557
    .line 558
    .line 559
    new-instance v15, La69;

    .line 560
    .line 561
    const/4 v8, 0x6

    .line 562
    invoke-direct {v15, v8}, La69;-><init>(B)V

    .line 563
    .line 564
    .line 565
    new-instance v8, Lla2;

    .line 566
    .line 567
    invoke-direct {v8, v0, v6, v15}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 568
    .line 569
    .line 570
    new-instance v0, La69;

    .line 571
    .line 572
    const/4 v15, 0x7

    .line 573
    invoke-direct {v0, v15}, La69;-><init>(B)V

    .line 574
    .line 575
    .line 576
    invoke-static {v8, v0}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    new-instance v8, Lut8;

    .line 581
    .line 582
    const/16 v15, 0x1a

    .line 583
    .line 584
    invoke-direct {v8, v15}, Lut8;-><init>(B)V

    .line 585
    .line 586
    .line 587
    new-instance v15, Lla2;

    .line 588
    .line 589
    invoke-direct {v15, v0, v6, v8}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 590
    .line 591
    .line 592
    new-instance v0, Lka2;

    .line 593
    .line 594
    invoke-direct {v0, v15}, Lka2;-><init>(Lla2;)V

    .line 595
    .line 596
    .line 597
    :goto_11
    invoke-virtual {v0}, Lka2;->hasNext()Z

    .line 598
    .line 599
    .line 600
    move-result v8

    .line 601
    if-eqz v8, :cond_18

    .line 602
    .line 603
    invoke-virtual {v0}, Lka2;->next()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v8

    .line 607
    check-cast v8, Lbq3;

    .line 608
    .line 609
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    const-string v15, "listen"

    .line 613
    .line 614
    invoke-static {v8, v15}, Li21;->R(Lbq3;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 615
    .line 616
    .line 617
    goto :goto_11

    .line 618
    :catchall_0
    move-exception v0

    .line 619
    instance-of v8, v0, Ljava/lang/InterruptedException;

    .line 620
    .line 621
    if-nez v8, :cond_17

    .line 622
    .line 623
    instance-of v8, v0, Ljava/util/concurrent/CancellationException;

    .line 624
    .line 625
    if-nez v8, :cond_17

    .line 626
    .line 627
    goto :goto_12

    .line 628
    :cond_17
    throw v0

    .line 629
    :cond_18
    :goto_12
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    iget-object v0, v11, Len3;->X:Ljava/util/ArrayList;

    .line 633
    .line 634
    invoke-static {}, Ln67;->d()I

    .line 635
    .line 636
    .line 637
    move-result v8

    .line 638
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 639
    .line 640
    .line 641
    move-result-object v15

    .line 642
    const/4 v3, -0x1

    .line 643
    const-string v6, "pref_socks_auth_mode"

    .line 644
    .line 645
    invoke-virtual {v15, v3, v6}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 646
    .line 647
    .line 648
    move-result v6

    .line 649
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 650
    .line 651
    .line 652
    move-result-object v15

    .line 653
    if-eq v6, v3, :cond_19

    .line 654
    .line 655
    goto :goto_13

    .line 656
    :cond_19
    const/4 v15, 0x0

    .line 657
    :goto_13
    if-eqz v15, :cond_1a

    .line 658
    .line 659
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 660
    .line 661
    .line 662
    move-result v6

    .line 663
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->b()Ll22;

    .line 664
    .line 665
    .line 666
    move-result-object v15

    .line 667
    check-cast v15, Ln22;

    .line 668
    .line 669
    invoke-virtual {v15, v6}, Ln22;->get(I)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v6

    .line 673
    check-cast v6, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 674
    .line 675
    if-eqz v6, :cond_1a

    .line 676
    .line 677
    goto :goto_14

    .line 678
    :cond_1a
    sget-object v6, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->Companion:Lsu/happ/proxyutility/dto/enums/InboundAuthMode$Companion;

    .line 679
    .line 680
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->a()Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 684
    .line 685
    .line 686
    move-result-object v6

    .line 687
    :goto_14
    new-instance v15, Lhu;

    .line 688
    .line 689
    const/4 v3, 0x1

    .line 690
    invoke-direct {v15, v11, v3}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 691
    .line 692
    .line 693
    new-instance v3, Lut8;

    .line 694
    .line 695
    move-object/from16 p2, v0

    .line 696
    .line 697
    const/16 v0, 0x1d

    .line 698
    .line 699
    invoke-direct {v3, v0}, Lut8;-><init>(B)V

    .line 700
    .line 701
    .line 702
    new-instance v0, Lla2;

    .line 703
    .line 704
    move-object/from16 p3, v6

    .line 705
    .line 706
    const/4 v6, 0x1

    .line 707
    invoke-direct {v0, v15, v6, v3}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 708
    .line 709
    .line 710
    new-instance v3, La69;

    .line 711
    .line 712
    const/4 v6, 0x0

    .line 713
    invoke-direct {v3, v6}, La69;-><init>(B)V

    .line 714
    .line 715
    .line 716
    invoke-static {v0, v3}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    iget-object v3, v0, Lmd8;->a:Lu27;

    .line 721
    .line 722
    invoke-interface {v3}, Lu27;->iterator()Ljava/util/Iterator;

    .line 723
    .line 724
    .line 725
    move-result-object v3

    .line 726
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 727
    .line 728
    .line 729
    move-result v6

    .line 730
    const-string v15, "protocol"

    .line 731
    .line 732
    move-object/from16 p4, v3

    .line 733
    .line 734
    const-string v3, "port"

    .line 735
    .line 736
    move/from16 v19, v6

    .line 737
    .line 738
    const-string v6, "socks"

    .line 739
    .line 740
    if-eqz v19, :cond_1c

    .line 741
    .line 742
    move-object/from16 v19, v7

    .line 743
    .line 744
    iget-object v7, v0, Lmd8;->b:Lgn2;

    .line 745
    .line 746
    move-object/from16 v20, v0

    .line 747
    .line 748
    invoke-interface/range {p4 .. p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    invoke-interface {v7, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    move-object v7, v0

    .line 757
    check-cast v7, Lbq3;

    .line 758
    .line 759
    invoke-virtual {v7, v15}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 760
    .line 761
    .line 762
    move-result-object v21

    .line 763
    move-object/from16 v22, v0

    .line 764
    .line 765
    invoke-virtual/range {v21 .. v21}, Lbo3;->d()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    invoke-static {v0, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v0

    .line 773
    if-eqz v0, :cond_1b

    .line 774
    .line 775
    invoke-virtual {v7, v3}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    invoke-virtual {v0}, Lbo3;->a()I

    .line 780
    .line 781
    .line 782
    move-result v0

    .line 783
    if-ne v0, v8, :cond_1b

    .line 784
    .line 785
    goto :goto_16

    .line 786
    :cond_1b
    move-object/from16 v3, p4

    .line 787
    .line 788
    move-object/from16 v7, v19

    .line 789
    .line 790
    move-object/from16 v0, v20

    .line 791
    .line 792
    goto :goto_15

    .line 793
    :cond_1c
    move-object/from16 v19, v7

    .line 794
    .line 795
    const/16 v22, 0x0

    .line 796
    .line 797
    :goto_16
    check-cast v22, Lbq3;

    .line 798
    .line 799
    invoke-static {}, Ln67;->b()I

    .line 800
    .line 801
    .line 802
    move-result v0

    .line 803
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 804
    .line 805
    .line 806
    move-result-object v7

    .line 807
    move-object/from16 v20, v5

    .line 808
    .line 809
    const-string v5, "pref_http_auth_mode"

    .line 810
    .line 811
    move-object/from16 v21, v4

    .line 812
    .line 813
    const/4 v4, -0x1

    .line 814
    invoke-virtual {v7, v4, v5}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 815
    .line 816
    .line 817
    move-result v5

    .line 818
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 819
    .line 820
    .line 821
    move-result-object v7

    .line 822
    if-eq v5, v4, :cond_1d

    .line 823
    .line 824
    goto :goto_17

    .line 825
    :cond_1d
    const/4 v7, 0x0

    .line 826
    :goto_17
    if-eqz v7, :cond_1e

    .line 827
    .line 828
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 829
    .line 830
    .line 831
    move-result v4

    .line 832
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->b()Ll22;

    .line 833
    .line 834
    .line 835
    move-result-object v5

    .line 836
    check-cast v5, Ln22;

    .line 837
    .line 838
    invoke-virtual {v5, v4}, Ln22;->get(I)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v4

    .line 842
    check-cast v4, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 843
    .line 844
    if-eqz v4, :cond_1e

    .line 845
    .line 846
    goto :goto_18

    .line 847
    :cond_1e
    sget-object v4, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->Companion:Lsu/happ/proxyutility/dto/enums/InboundAuthMode$Companion;

    .line 848
    .line 849
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->a()Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 853
    .line 854
    .line 855
    move-result-object v4

    .line 856
    :goto_18
    new-instance v5, Lhu;

    .line 857
    .line 858
    const/4 v7, 0x1

    .line 859
    invoke-direct {v5, v11, v7}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 860
    .line 861
    .line 862
    move-object/from16 p1, v4

    .line 863
    .line 864
    new-instance v4, La69;

    .line 865
    .line 866
    invoke-direct {v4, v7}, La69;-><init>(B)V

    .line 867
    .line 868
    .line 869
    move-object/from16 p4, v13

    .line 870
    .line 871
    new-instance v13, Lla2;

    .line 872
    .line 873
    invoke-direct {v13, v5, v7, v4}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 874
    .line 875
    .line 876
    new-instance v4, La69;

    .line 877
    .line 878
    const/4 v5, 0x2

    .line 879
    invoke-direct {v4, v5}, La69;-><init>(B)V

    .line 880
    .line 881
    .line 882
    invoke-static {v13, v4}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 883
    .line 884
    .line 885
    move-result-object v4

    .line 886
    iget-object v7, v4, Lmd8;->a:Lu27;

    .line 887
    .line 888
    invoke-interface {v7}, Lu27;->iterator()Ljava/util/Iterator;

    .line 889
    .line 890
    .line 891
    move-result-object v7

    .line 892
    :goto_19
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 893
    .line 894
    .line 895
    move-result v13

    .line 896
    if-eqz v13, :cond_20

    .line 897
    .line 898
    iget-object v13, v4, Lmd8;->b:Lgn2;

    .line 899
    .line 900
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v5

    .line 904
    invoke-interface {v13, v5}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v5

    .line 908
    move-object v13, v5

    .line 909
    check-cast v13, Lbq3;

    .line 910
    .line 911
    invoke-virtual {v13, v15}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 912
    .line 913
    .line 914
    move-result-object v23

    .line 915
    move-object/from16 v24, v4

    .line 916
    .line 917
    invoke-virtual/range {v23 .. v23}, Lbo3;->d()Ljava/lang/String;

    .line 918
    .line 919
    .line 920
    move-result-object v4

    .line 921
    move-object/from16 v23, v5

    .line 922
    .line 923
    const-string v5, "http"

    .line 924
    .line 925
    invoke-static {v4, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 926
    .line 927
    .line 928
    move-result v4

    .line 929
    if-eqz v4, :cond_1f

    .line 930
    .line 931
    invoke-virtual {v13, v3}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 932
    .line 933
    .line 934
    move-result-object v4

    .line 935
    invoke-virtual {v4}, Lbo3;->a()I

    .line 936
    .line 937
    .line 938
    move-result v4

    .line 939
    if-ne v4, v0, :cond_1f

    .line 940
    .line 941
    goto :goto_1a

    .line 942
    :cond_1f
    move-object/from16 v4, v24

    .line 943
    .line 944
    const/4 v5, 0x2

    .line 945
    goto :goto_19

    .line 946
    :cond_20
    const/16 v23, 0x0

    .line 947
    .line 948
    :goto_1a
    check-cast v23, Lbq3;

    .line 949
    .line 950
    sget-object v3, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 951
    .line 952
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 953
    .line 954
    .line 955
    move-result-object v3

    .line 956
    invoke-virtual {v3}, Lsu/happ/proxyutility/HappApplication;->e()Lc16;

    .line 957
    .line 958
    .line 959
    move-result-object v3

    .line 960
    new-instance v4, Lhu;

    .line 961
    .line 962
    const/4 v7, 0x1

    .line 963
    invoke-direct {v4, v11, v7}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 964
    .line 965
    .line 966
    new-instance v5, La69;

    .line 967
    .line 968
    const/4 v13, 0x3

    .line 969
    invoke-direct {v5, v13}, La69;-><init>(B)V

    .line 970
    .line 971
    .line 972
    new-instance v13, Lla2;

    .line 973
    .line 974
    invoke-direct {v13, v4, v7, v5}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 975
    .line 976
    .line 977
    new-instance v4, La69;

    .line 978
    .line 979
    const/4 v5, 0x4

    .line 980
    invoke-direct {v4, v5}, La69;-><init>(B)V

    .line 981
    .line 982
    .line 983
    invoke-static {v13, v4}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 984
    .line 985
    .line 986
    move-result-object v4

    .line 987
    new-instance v13, Ln73;

    .line 988
    .line 989
    invoke-direct {v13, v8, v0, v7}, Ln73;-><init>(IIB)V

    .line 990
    .line 991
    .line 992
    new-instance v0, Lla2;

    .line 993
    .line 994
    invoke-direct {v0, v4, v7, v13}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 995
    .line 996
    .line 997
    new-instance v4, Lka2;

    .line 998
    .line 999
    invoke-direct {v4, v0}, Lka2;-><init>(Lla2;)V

    .line 1000
    .line 1001
    .line 1002
    :goto_1b
    invoke-virtual {v4}, Lka2;->hasNext()Z

    .line 1003
    .line 1004
    .line 1005
    move-result v0

    .line 1006
    if-eqz v0, :cond_2e

    .line 1007
    .line 1008
    invoke-virtual {v4}, Lka2;->next()Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v0

    .line 1012
    check-cast v0, Lbq3;

    .line 1013
    .line 1014
    invoke-virtual {v0, v15}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v7

    .line 1018
    invoke-virtual {v7}, Lbo3;->d()Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v7

    .line 1022
    invoke-static {v7, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v7

    .line 1026
    if-eqz v7, :cond_21

    .line 1027
    .line 1028
    move-object/from16 v8, v22

    .line 1029
    .line 1030
    goto :goto_1c

    .line 1031
    :cond_21
    move-object/from16 v8, v23

    .line 1032
    .line 1033
    :goto_1c
    if-eqz v7, :cond_22

    .line 1034
    .line 1035
    move-object/from16 v13, p3

    .line 1036
    .line 1037
    goto :goto_1d

    .line 1038
    :cond_22
    move-object/from16 v13, p1

    .line 1039
    .line 1040
    :goto_1d
    if-eqz v7, :cond_23

    .line 1041
    .line 1042
    invoke-virtual {v3}, Lc16;->f()Lsu/happ/proxyutility/dto/AuthData;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v7

    .line 1046
    goto :goto_1e

    .line 1047
    :cond_23
    invoke-virtual {v3}, Lc16;->d()Lsu/happ/proxyutility/dto/AuthData;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v7

    .line 1051
    :goto_1e
    const-string v5, "settings"

    .line 1052
    .line 1053
    move-object/from16 v25, v3

    .line 1054
    .line 1055
    invoke-virtual {v0, v5}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v3

    .line 1059
    move-object/from16 v26, v4

    .line 1060
    .line 1061
    if-eqz v3, :cond_25

    .line 1062
    .line 1063
    instance-of v4, v3, Lbq3;

    .line 1064
    .line 1065
    if-eqz v4, :cond_24

    .line 1066
    .line 1067
    goto :goto_1f

    .line 1068
    :cond_24
    const/4 v3, 0x0

    .line 1069
    :goto_1f
    if-eqz v3, :cond_25

    .line 1070
    .line 1071
    invoke-virtual {v3}, Lbo3;->c()Lbq3;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v3

    .line 1075
    move-object/from16 v27, v6

    .line 1076
    .line 1077
    move-object/from16 v28, v7

    .line 1078
    .line 1079
    goto :goto_20

    .line 1080
    :cond_25
    sget-object v3, Lyw2;->c:Lcom/google/gson/a;

    .line 1081
    .line 1082
    new-instance v4, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;

    .line 1083
    .line 1084
    move-object/from16 v27, v6

    .line 1085
    .line 1086
    const/16 v6, 0x1ff

    .line 1087
    .line 1088
    move-object/from16 v28, v7

    .line 1089
    .line 1090
    const/4 v7, 0x0

    .line 1091
    invoke-direct {v4, v7, v6}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;-><init>(Ljava/lang/String;I)V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v3, v4}, Lcom/google/gson/a;->k(Ljava/lang/Object;)Lbo3;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v3

    .line 1098
    invoke-virtual {v3}, Lbo3;->c()Lbq3;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v3

    .line 1102
    :goto_20
    if-eqz v8, :cond_27

    .line 1103
    .line 1104
    invoke-virtual {v8, v5}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v7

    .line 1108
    if-eqz v7, :cond_27

    .line 1109
    .line 1110
    instance-of v4, v7, Lbq3;

    .line 1111
    .line 1112
    if-eqz v4, :cond_26

    .line 1113
    .line 1114
    goto :goto_21

    .line 1115
    :cond_26
    const/4 v7, 0x0

    .line 1116
    :goto_21
    if-eqz v7, :cond_27

    .line 1117
    .line 1118
    invoke-virtual {v7}, Lbo3;->c()Lbq3;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v7

    .line 1122
    goto :goto_22

    .line 1123
    :cond_27
    const/4 v7, 0x0

    .line 1124
    :goto_22
    invoke-static {}, Ln67;->c()Lcom/tencent/mmkv/MMKV;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v4

    .line 1128
    const/4 v6, 0x0

    .line 1129
    invoke-virtual {v4, v14, v6}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 1130
    .line 1131
    .line 1132
    move-result v4

    .line 1133
    const-string v6, "noauth"

    .line 1134
    .line 1135
    const-string v8, "auth"

    .line 1136
    .line 1137
    if-eqz v4, :cond_28

    .line 1138
    .line 1139
    new-instance v4, Liq3;

    .line 1140
    .line 1141
    invoke-direct {v4, v6}, Liq3;-><init>(Ljava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v3, v8, v4}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1145
    .line 1146
    .line 1147
    sget-object v4, Lyw2;->c:Lcom/google/gson/a;

    .line 1148
    .line 1149
    invoke-virtual {v4, v3}, Lcom/google/gson/a;->k(Ljava/lang/Object;)Lbo3;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v3

    .line 1153
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v0, v5, v3}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1157
    .line 1158
    .line 1159
    move-object/from16 v30, v12

    .line 1160
    .line 1161
    move-object/from16 v29, v14

    .line 1162
    .line 1163
    const/16 v16, 0x0

    .line 1164
    .line 1165
    goto/16 :goto_26

    .line 1166
    .line 1167
    :cond_28
    sget-object v4, Lc69;->c:[I

    .line 1168
    .line 1169
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 1170
    .line 1171
    .line 1172
    move-result v13

    .line 1173
    aget v4, v4, v13

    .line 1174
    .line 1175
    const/4 v13, 0x1

    .line 1176
    if-ne v4, v13, :cond_29

    .line 1177
    .line 1178
    if-eqz v7, :cond_29

    .line 1179
    .line 1180
    move-object v3, v7

    .line 1181
    move-object/from16 v30, v12

    .line 1182
    .line 1183
    move-object/from16 v29, v14

    .line 1184
    .line 1185
    :goto_23
    const/16 v16, 0x0

    .line 1186
    .line 1187
    goto/16 :goto_25

    .line 1188
    .line 1189
    :cond_29
    if-eq v4, v13, :cond_2a

    .line 1190
    .line 1191
    const/4 v7, 0x2

    .line 1192
    if-ne v4, v7, :cond_2b

    .line 1193
    .line 1194
    :cond_2a
    move-object/from16 v30, v12

    .line 1195
    .line 1196
    move-object/from16 v29, v14

    .line 1197
    .line 1198
    const/16 v16, 0x0

    .line 1199
    .line 1200
    goto/16 :goto_24

    .line 1201
    .line 1202
    :cond_2b
    const-string v6, "pass"

    .line 1203
    .line 1204
    const-string v13, "user"

    .line 1205
    .line 1206
    const-string v7, "accounts"

    .line 1207
    .line 1208
    move-object/from16 v29, v14

    .line 1209
    .line 1210
    const-string v14, "password"

    .line 1211
    .line 1212
    move-object/from16 v30, v12

    .line 1213
    .line 1214
    const/4 v12, 0x3

    .line 1215
    if-ne v4, v12, :cond_2c

    .line 1216
    .line 1217
    new-instance v4, Liq3;

    .line 1218
    .line 1219
    invoke-direct {v4, v14}, Liq3;-><init>(Ljava/lang/String;)V

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v3, v8, v4}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1223
    .line 1224
    .line 1225
    new-instance v4, Len3;

    .line 1226
    .line 1227
    invoke-direct {v4}, Len3;-><init>()V

    .line 1228
    .line 1229
    .line 1230
    new-instance v8, Lbq3;

    .line 1231
    .line 1232
    invoke-direct {v8}, Lbq3;-><init>()V

    .line 1233
    .line 1234
    .line 1235
    new-instance v14, Liq3;

    .line 1236
    .line 1237
    invoke-virtual/range {v28 .. v28}, Lsu/happ/proxyutility/dto/AuthData;->b()Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v12

    .line 1241
    invoke-direct {v14, v12}, Liq3;-><init>(Ljava/lang/String;)V

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v8, v13, v14}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1245
    .line 1246
    .line 1247
    new-instance v12, Liq3;

    .line 1248
    .line 1249
    invoke-virtual/range {v28 .. v28}, Lsu/happ/proxyutility/dto/AuthData;->a()Ljava/lang/String;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v13

    .line 1253
    invoke-direct {v12, v13}, Liq3;-><init>(Ljava/lang/String;)V

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v8, v6, v12}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v4, v8}, Len3;->e(Lbo3;)V

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v3, v7, v4}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1263
    .line 1264
    .line 1265
    goto :goto_23

    .line 1266
    :cond_2c
    const/4 v12, 0x4

    .line 1267
    if-ne v4, v12, :cond_2d

    .line 1268
    .line 1269
    new-instance v4, Liq3;

    .line 1270
    .line 1271
    invoke-direct {v4, v14}, Liq3;-><init>(Ljava/lang/String;)V

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v3, v8, v4}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1275
    .line 1276
    .line 1277
    new-instance v4, Len3;

    .line 1278
    .line 1279
    invoke-direct {v4}, Len3;-><init>()V

    .line 1280
    .line 1281
    .line 1282
    new-instance v8, Lbq3;

    .line 1283
    .line 1284
    invoke-direct {v8}, Lbq3;-><init>()V

    .line 1285
    .line 1286
    .line 1287
    new-instance v14, Liq3;

    .line 1288
    .line 1289
    invoke-virtual/range {v28 .. v28}, Lsu/happ/proxyutility/dto/AuthData;->b()Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v12

    .line 1293
    invoke-direct {v14, v12}, Liq3;-><init>(Ljava/lang/String;)V

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual {v8, v13, v14}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1297
    .line 1298
    .line 1299
    new-instance v12, Liq3;

    .line 1300
    .line 1301
    invoke-virtual/range {v28 .. v28}, Lsu/happ/proxyutility/dto/AuthData;->a()Ljava/lang/String;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v13

    .line 1305
    invoke-direct {v12, v13}, Liq3;-><init>(Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v8, v6, v12}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v4, v8}, Len3;->e(Lbo3;)V

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v3, v7, v4}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1315
    .line 1316
    .line 1317
    goto/16 :goto_23

    .line 1318
    .line 1319
    :cond_2d
    invoke-static {}, Lb61;->c()V

    .line 1320
    .line 1321
    .line 1322
    const/16 v16, 0x0

    .line 1323
    .line 1324
    return-object v16

    .line 1325
    :goto_24
    new-instance v4, Liq3;

    .line 1326
    .line 1327
    invoke-direct {v4, v6}, Liq3;-><init>(Ljava/lang/String;)V

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v3, v8, v4}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1331
    .line 1332
    .line 1333
    :goto_25
    sget-object v4, Lyw2;->c:Lcom/google/gson/a;

    .line 1334
    .line 1335
    invoke-virtual {v4, v3}, Lcom/google/gson/a;->k(Ljava/lang/Object;)Lbo3;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v3

    .line 1339
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual {v0, v5, v3}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1343
    .line 1344
    .line 1345
    :goto_26
    move-object/from16 v3, v25

    .line 1346
    .line 1347
    move-object/from16 v4, v26

    .line 1348
    .line 1349
    move-object/from16 v6, v27

    .line 1350
    .line 1351
    move-object/from16 v14, v29

    .line 1352
    .line 1353
    move-object/from16 v12, v30

    .line 1354
    .line 1355
    const/4 v5, 0x4

    .line 1356
    goto/16 :goto_1b

    .line 1357
    .line 1358
    :cond_2e
    move-object/from16 v30, v12

    .line 1359
    .line 1360
    const/16 v16, 0x0

    .line 1361
    .line 1362
    invoke-static {}, Ln67;->f()Z

    .line 1363
    .line 1364
    .line 1365
    move-result v0

    .line 1366
    const-string v3, "tag"

    .line 1367
    .line 1368
    if-eqz v0, :cond_33

    .line 1369
    .line 1370
    invoke-static {}, Ln67;->c()Lcom/tencent/mmkv/MMKV;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v0

    .line 1374
    const-string v4, "pref_block_bindtodevice_enabled"

    .line 1375
    .line 1376
    const/4 v6, 0x0

    .line 1377
    invoke-virtual {v0, v4, v6}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 1378
    .line 1379
    .line 1380
    move-result v0

    .line 1381
    if-eqz v0, :cond_33

    .line 1382
    .line 1383
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1384
    .line 1385
    .line 1386
    new-instance v0, Lhu;

    .line 1387
    .line 1388
    const/4 v7, 0x1

    .line 1389
    invoke-direct {v0, v9, v7}, Lhu;-><init>(Ljava/lang/Object;B)V

    .line 1390
    .line 1391
    .line 1392
    new-instance v4, Lut8;

    .line 1393
    .line 1394
    const/16 v5, 0x1b

    .line 1395
    .line 1396
    invoke-direct {v4, v5}, Lut8;-><init>(B)V

    .line 1397
    .line 1398
    .line 1399
    new-instance v5, Lla2;

    .line 1400
    .line 1401
    invoke-direct {v5, v0, v7, v4}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 1402
    .line 1403
    .line 1404
    new-instance v0, Lut8;

    .line 1405
    .line 1406
    const/16 v4, 0x1c

    .line 1407
    .line 1408
    invoke-direct {v0, v4}, Lut8;-><init>(B)V

    .line 1409
    .line 1410
    .line 1411
    invoke-static {v5, v0}, Lw27;->l0(Lu27;Lgn2;)Lmd8;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v0

    .line 1415
    iget-object v4, v0, Lmd8;->a:Lu27;

    .line 1416
    .line 1417
    invoke-interface {v4}, Lu27;->iterator()Ljava/util/Iterator;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v4

    .line 1421
    :cond_2f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1422
    .line 1423
    .line 1424
    move-result v5

    .line 1425
    const-string v6, "block"

    .line 1426
    .line 1427
    if-eqz v5, :cond_31

    .line 1428
    .line 1429
    iget-object v5, v0, Lmd8;->b:Lgn2;

    .line 1430
    .line 1431
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v7

    .line 1435
    invoke-interface {v5, v7}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v7

    .line 1439
    move-object v5, v7

    .line 1440
    check-cast v5, Lbq3;

    .line 1441
    .line 1442
    invoke-virtual {v5, v3}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v5

    .line 1446
    if-eqz v5, :cond_30

    .line 1447
    .line 1448
    invoke-virtual {v5}, Lbo3;->d()Ljava/lang/String;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v5

    .line 1452
    goto :goto_27

    .line 1453
    :cond_30
    move-object/from16 v5, v16

    .line 1454
    .line 1455
    :goto_27
    invoke-static {v5, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1456
    .line 1457
    .line 1458
    move-result v5

    .line 1459
    if-eqz v5, :cond_2f

    .line 1460
    .line 1461
    goto :goto_28

    .line 1462
    :cond_31
    move-object/from16 v7, v16

    .line 1463
    .line 1464
    :goto_28
    check-cast v7, Lbq3;

    .line 1465
    .line 1466
    if-nez v7, :cond_32

    .line 1467
    .line 1468
    new-instance v0, Lbq3;

    .line 1469
    .line 1470
    invoke-direct {v0}, Lbq3;-><init>()V

    .line 1471
    .line 1472
    .line 1473
    invoke-virtual {v0, v3, v6}, Lbq3;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1474
    .line 1475
    .line 1476
    const-string v4, "blackhole"

    .line 1477
    .line 1478
    invoke-virtual {v0, v15, v4}, Lbq3;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v9, v0}, Len3;->e(Lbo3;)V

    .line 1482
    .line 1483
    .line 1484
    :cond_32
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1485
    .line 1486
    .line 1487
    new-instance v0, Lbq3;

    .line 1488
    .line 1489
    invoke-direct {v0}, Lbq3;-><init>()V

    .line 1490
    .line 1491
    .line 1492
    new-instance v4, Len3;

    .line 1493
    .line 1494
    invoke-direct {v4}, Len3;-><init>()V

    .line 1495
    .line 1496
    .line 1497
    new-instance v5, Liq3;

    .line 1498
    .line 1499
    const-string v7, "-1"

    .line 1500
    .line 1501
    invoke-direct {v5, v7}, Liq3;-><init>(Ljava/lang/String;)V

    .line 1502
    .line 1503
    .line 1504
    iget-object v7, v4, Len3;->X:Ljava/util/ArrayList;

    .line 1505
    .line 1506
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1507
    .line 1508
    .line 1509
    const-string v5, "process"

    .line 1510
    .line 1511
    invoke-virtual {v0, v5, v4}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1512
    .line 1513
    .line 1514
    const-string v4, "outboundTag"

    .line 1515
    .line 1516
    invoke-virtual {v0, v4, v6}, Lbq3;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1517
    .line 1518
    .line 1519
    new-instance v4, Len3;

    .line 1520
    .line 1521
    invoke-direct {v4}, Len3;-><init>()V

    .line 1522
    .line 1523
    .line 1524
    invoke-virtual {v4, v0}, Len3;->e(Lbo3;)V

    .line 1525
    .line 1526
    .line 1527
    iget-object v0, v4, Len3;->X:Ljava/util/ArrayList;

    .line 1528
    .line 1529
    iget-object v5, v10, Len3;->X:Ljava/util/ArrayList;

    .line 1530
    .line 1531
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1532
    .line 1533
    .line 1534
    move-object v10, v4

    .line 1535
    :cond_33
    invoke-virtual {v1, v2, v11}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1536
    .line 1537
    .line 1538
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1539
    .line 1540
    .line 1541
    move-object/from16 v4, v30

    .line 1542
    .line 1543
    invoke-virtual {v1, v4, v9}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1544
    .line 1545
    .line 1546
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1547
    .line 1548
    .line 1549
    move-object/from16 v4, p4

    .line 1550
    .line 1551
    move-object/from16 v5, v21

    .line 1552
    .line 1553
    invoke-virtual {v4, v5, v10}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1554
    .line 1555
    .line 1556
    move-object/from16 v5, v20

    .line 1557
    .line 1558
    invoke-virtual {v1, v5, v4}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1559
    .line 1560
    .line 1561
    invoke-static {}, Ln67;->f()Z

    .line 1562
    .line 1563
    .line 1564
    move-result v0

    .line 1565
    if-eqz v0, :cond_42

    .line 1566
    .line 1567
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 1568
    .line 1569
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1570
    .line 1571
    .line 1572
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v4

    .line 1576
    :cond_34
    :goto_29
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1577
    .line 1578
    .line 1579
    move-result v5

    .line 1580
    if-eqz v5, :cond_35

    .line 1581
    .line 1582
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v5

    .line 1586
    move-object v6, v5

    .line 1587
    check-cast v6, Lbo3;

    .line 1588
    .line 1589
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1590
    .line 1591
    .line 1592
    instance-of v6, v6, Lbq3;

    .line 1593
    .line 1594
    if-eqz v6, :cond_34

    .line 1595
    .line 1596
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1597
    .line 1598
    .line 1599
    goto :goto_29

    .line 1600
    :catchall_1
    move-exception v0

    .line 1601
    goto/16 :goto_2d

    .line 1602
    .line 1603
    :cond_35
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v0

    .line 1607
    :cond_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1608
    .line 1609
    .line 1610
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1611
    const-string v5, "tun"

    .line 1612
    .line 1613
    if-eqz v4, :cond_39

    .line 1614
    .line 1615
    :try_start_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v4

    .line 1619
    check-cast v4, Lbo3;

    .line 1620
    .line 1621
    invoke-virtual {v4}, Lbo3;->c()Lbq3;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v4

    .line 1625
    invoke-virtual {v4, v3}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v6

    .line 1629
    if-eqz v6, :cond_37

    .line 1630
    .line 1631
    instance-of v6, v6, Lxp3;

    .line 1632
    .line 1633
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v7

    .line 1637
    goto :goto_2a

    .line 1638
    :cond_37
    move-object/from16 v7, v16

    .line 1639
    .line 1640
    :goto_2a
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1641
    .line 1642
    invoke-static {v7, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1643
    .line 1644
    .line 1645
    move-result v6

    .line 1646
    if-eqz v6, :cond_38

    .line 1647
    .line 1648
    invoke-virtual {v4, v3}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v4

    .line 1652
    invoke-virtual {v4}, Lbo3;->d()Ljava/lang/String;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v4

    .line 1656
    goto :goto_2b

    .line 1657
    :cond_38
    move-object/from16 v4, v19

    .line 1658
    .line 1659
    :goto_2b
    invoke-static {v4, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1660
    .line 1661
    .line 1662
    move-result v4

    .line 1663
    if-eqz v4, :cond_36

    .line 1664
    .line 1665
    invoke-static {v1}, Lx79;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v0

    .line 1669
    goto/16 :goto_2e

    .line 1670
    .line 1671
    :cond_39
    sget-object v0, Lss8;->a:Lss8;

    .line 1672
    .line 1673
    const-string v0, "xray_config_with_tun.json"

    .line 1674
    .line 1675
    move-object/from16 v3, p0

    .line 1676
    .line 1677
    invoke-static {v3, v0}, Lss8;->D(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    sget-object v3, Lyw2;->c:Lcom/google/gson/a;

    .line 1682
    .line 1683
    const-class v4, Lsu/happ/proxyutility/dto/XRayConfig;

    .line 1684
    .line 1685
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1686
    .line 1687
    .line 1688
    new-instance v6, Lyi8;

    .line 1689
    .line 1690
    invoke-direct {v6, v4}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 1691
    .line 1692
    .line 1693
    invoke-virtual {v3, v0, v6}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v0

    .line 1697
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig;

    .line 1698
    .line 1699
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v0

    .line 1703
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v0

    .line 1707
    :cond_3a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1708
    .line 1709
    .line 1710
    move-result v3

    .line 1711
    if-eqz v3, :cond_3b

    .line 1712
    .line 1713
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v7

    .line 1717
    move-object v3, v7

    .line 1718
    check-cast v3, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 1719
    .line 1720
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->e()Ljava/lang/String;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v3

    .line 1724
    invoke-static {v3, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1725
    .line 1726
    .line 1727
    move-result v3

    .line 1728
    if-eqz v3, :cond_3a

    .line 1729
    .line 1730
    goto :goto_2c

    .line 1731
    :cond_3b
    move-object/from16 v7, v16

    .line 1732
    .line 1733
    :goto_2c
    check-cast v7, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 1734
    .line 1735
    if-nez v7, :cond_3c

    .line 1736
    .line 1737
    invoke-static {v1}, Lx79;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v0

    .line 1741
    goto :goto_2e

    .line 1742
    :cond_3c
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->c()Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v0

    .line 1746
    if-eqz v0, :cond_3d

    .line 1747
    .line 1748
    sget-object v3, Ln67;->a:Lvz7;

    .line 1749
    .line 1750
    sget-object v3, Lss8;->a:Lss8;

    .line 1751
    .line 1752
    invoke-static {}, Ln67;->c()Lcom/tencent/mmkv/MMKV;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v3

    .line 1756
    const-string v4, "pref_tun_mtu"

    .line 1757
    .line 1758
    invoke-virtual {v3, v4}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v3

    .line 1762
    const/16 v4, 0x5dc

    .line 1763
    .line 1764
    invoke-static {v4, v3}, Lss8;->C(ILjava/lang/String;)I

    .line 1765
    .line 1766
    .line 1767
    move-result v3

    .line 1768
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v3

    .line 1772
    invoke-virtual {v0, v3}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;->c(Ljava/lang/Integer;)V

    .line 1773
    .line 1774
    .line 1775
    :cond_3d
    sget-object v0, Lyw2;->c:Lcom/google/gson/a;

    .line 1776
    .line 1777
    invoke-virtual {v0, v7}, Lcom/google/gson/a;->k(Ljava/lang/Object;)Lbo3;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v0

    .line 1781
    invoke-virtual {v11, v0}, Len3;->e(Lbo3;)V

    .line 1782
    .line 1783
    .line 1784
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    .line 1785
    .line 1786
    .line 1787
    move-result v0

    .line 1788
    const/4 v7, 0x1

    .line 1789
    if-ne v0, v7, :cond_3e

    .line 1790
    .line 1791
    invoke-virtual {v1, v2, v11}, Lbq3;->e(Ljava/lang/String;Lbo3;)V

    .line 1792
    .line 1793
    .line 1794
    :cond_3e
    invoke-static {v1}, Lx79;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1798
    goto :goto_2e

    .line 1799
    :goto_2d
    instance-of v2, v0, Ljava/lang/InterruptedException;

    .line 1800
    .line 1801
    if-nez v2, :cond_41

    .line 1802
    .line 1803
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 1804
    .line 1805
    if-nez v2, :cond_41

    .line 1806
    .line 1807
    new-instance v2, Lrj6;

    .line 1808
    .line 1809
    invoke-direct {v2, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 1810
    .line 1811
    .line 1812
    move-object v0, v2

    .line 1813
    :goto_2e
    nop

    .line 1814
    instance-of v2, v0, Lrj6;

    .line 1815
    .line 1816
    if-eqz v2, :cond_3f

    .line 1817
    .line 1818
    move-object/from16 v8, v16

    .line 1819
    .line 1820
    goto :goto_2f

    .line 1821
    :cond_3f
    move-object v8, v0

    .line 1822
    :goto_2f
    check-cast v8, Ljava/lang/String;

    .line 1823
    .line 1824
    new-instance v0, Lb69;

    .line 1825
    .line 1826
    if-nez v8, :cond_40

    .line 1827
    .line 1828
    invoke-static {v1}, Lx79;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v8

    .line 1832
    :cond_40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1833
    .line 1834
    .line 1835
    const/4 v7, 0x1

    .line 1836
    iput-boolean v7, v0, Lb69;->a:Z

    .line 1837
    .line 1838
    iput-object v8, v0, Lb69;->b:Ljava/lang/String;

    .line 1839
    .line 1840
    return-object v0

    .line 1841
    :cond_41
    throw v0

    .line 1842
    :cond_42
    const/4 v7, 0x1

    .line 1843
    new-instance v0, Lb69;

    .line 1844
    .line 1845
    invoke-static {v1}, Lx79;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v1

    .line 1849
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1850
    .line 1851
    .line 1852
    iput-boolean v7, v0, Lb69;->a:Z

    .line 1853
    .line 1854
    iput-object v1, v0, Lb69;->b:Ljava/lang/String;

    .line 1855
    .line 1856
    return-object v0

    .line 1857
    :cond_43
    move-object/from16 v19, v7

    .line 1858
    .line 1859
    new-instance v0, Lb69;

    .line 1860
    .line 1861
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1862
    .line 1863
    .line 1864
    const/4 v6, 0x0

    .line 1865
    iput-boolean v6, v0, Lb69;->a:Z

    .line 1866
    .line 1867
    move-object/from16 v1, v19

    .line 1868
    .line 1869
    iput-object v1, v0, Lb69;->b:Ljava/lang/String;

    .line 1870
    .line 1871
    return-object v0
.end method

.method public static n(Landroid/content/Context;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;Ljava/lang/String;ZLjava/lang/String;Z)Lb69;
    .locals 17

    move/from16 v1, p5

    .line 1
    const-string v2, "direct"

    const-string v3, "/"

    new-instance v4, Lb69;

    .line 2
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x0

    iput-boolean v5, v4, Lb69;->a:Z

    const-string v0, ""

    iput-object v0, v4, Lb69;->b:Ljava/lang/String;

    move-object/from16 v0, p0

    .line 3
    invoke-static {v0, v5}, Ld69;->q(Landroid/content/Context;Z)Lsu/happ/proxyutility/dto/XRayConfig;

    move-result-object v6

    if-nez v6, :cond_0

    return-object v4

    :cond_0
    move-object/from16 v0, p4

    .line 4
    invoke-static {v6, v0, v1}, Ld69;->r(Lsu/happ/proxyutility/dto/XRayConfig;Ljava/lang/String;Z)Z

    .line 5
    invoke-static {v6, v1}, Ld69;->p(Lsu/happ/proxyutility/dto/XRayConfig;Z)Z

    const/4 v7, -0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 6
    :try_start_0
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    move-result-object v0

    const-string v10, "pref_mux_enabled"

    invoke-virtual {v0, v10, v5}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    move-result v0

    .line 7
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->e()Ljava/lang/String;

    move-result-object v10

    .line 8
    const-string v11, "SHADOWSOCKS"

    invoke-static {v10, v11}, Lmm7;->S(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v12, "WIREGUARD"

    if-nez v11, :cond_3

    .line 9
    :try_start_1
    const-string v11, "SOCKS"

    invoke-static {v10, v11}, Lmm7;->S(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_3

    .line 10
    const-string v11, "TROJAN"

    invoke-static {v10, v11}, Lmm7;->S(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_3

    .line 11
    invoke-static {v10, v12}, Lmm7;->S(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v11

    if-eqz v11, :cond_2

    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->f()Ljava/lang/String;

    move-result-object v11

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_d

    :cond_2
    move-object v11, v9

    :goto_0
    sget-object v13, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->XHTTP:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    invoke-virtual {v13}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    move-result-object v13

    invoke-static {v11, v13}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    :cond_3
    :goto_1
    move v0, v5

    :cond_4
    if-eqz v0, :cond_d

    .line 13
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->c()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0, v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;->b(Z)V

    .line 14
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->c()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;

    move-result-object v0

    const/16 v11, 0x8

    const/4 v13, -0x2

    if-eqz v0, :cond_8

    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    move-result-object v14

    .line 15
    const-string v15, "pref_mux_concurency"

    invoke-virtual {v14, v13, v15}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    if-lt v14, v7, :cond_6

    goto :goto_2

    :cond_6
    move-object v15, v9

    :goto_2
    if-eqz v15, :cond_7

    .line 16
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v14

    goto :goto_3

    :cond_7
    move v14, v11

    :goto_3
    invoke-virtual {v0, v14}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;->a(I)V

    .line 17
    :cond_8
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->c()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    move-result-object v14

    .line 18
    const-string v15, "pref_mux_xudp_concurency"

    invoke-virtual {v14, v13, v15}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    if-lt v13, v7, :cond_9

    goto :goto_4

    :cond_9
    move-object v14, v9

    :goto_4
    if-eqz v14, :cond_a

    .line 19
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v11

    :cond_a
    invoke-virtual {v0, v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;->c(I)V

    .line 20
    :cond_b
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->c()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    move-result-object v11

    .line 21
    const-string v13, "pref_mux_xudp_quic"

    invoke-virtual {v11, v13}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_c

    .line 22
    sget-object v11, Lcr;->a:Ljava/lang/String;

    .line 23
    :cond_c
    invoke-virtual {v0, v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;->d(Ljava/lang/String;)V

    goto :goto_5

    .line 24
    :cond_d
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->c()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0, v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;->b(Z)V

    .line 25
    :cond_e
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->c()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0, v7}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$MuxBean;->a(I)V

    .line 26
    :cond_f
    :goto_5
    invoke-static {v10, v12}, Lmm7;->S(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 27
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_6

    :cond_10
    move-object v0, v9

    :goto_6
    if-nez v0, :cond_11

    .line 28
    const-string v0, "172.16.0.2/32"

    .line 29
    const-string v10, "2606:4700:110:8f81:d551:a0:532e:a2b3/128"

    filled-new-array {v0, v10}, [Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_8

    .line 31
    :cond_11
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_7

    :cond_12
    move-object v0, v9

    :goto_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Ljava/util/List;

    .line 32
    :goto_8
    invoke-static {}, Ln67;->g()Z

    move-result v10

    if-nez v10, :cond_13

    .line 33
    invoke-static {v0}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 34
    :cond_13
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    move-result-object v10

    if-eqz v10, :cond_14

    invoke-virtual {v10, v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;->m(Ljava/lang/Object;)V

    .line 35
    :cond_14
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->f()Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_15
    move-object v0, v9

    :goto_9
    sget-object v10, Lsu/happ/proxyutility/dto/XRayConfig;->Companion:Lsu/happ/proxyutility/dto/XRayConfig$Companion;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    invoke-static {}, Lsu/happ/proxyutility/dto/XRayConfig;->a()Ljava/lang/String;

    move-result-object v10

    .line 37
    invoke-static {v0, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 38
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_a

    :cond_16
    move-object v0, v9

    .line 39
    :goto_a
    invoke-static {}, Lsu/happ/proxyutility/dto/XRayConfig;->b()Ljava/lang/String;

    move-result-object v10

    .line 40
    invoke-static {v0, v10}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 41
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;->b()Ljava/util/List;

    move-result-object v0

    goto :goto_b

    :cond_17
    move-object v0, v9

    .line 42
    :goto_b
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v10

    if-eqz v10, :cond_18

    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;

    move-result-object v10

    if-eqz v10, :cond_18

    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;

    move-result-object v10

    if-eqz v10, :cond_18

    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;

    move-result-object v10

    if-eqz v10, :cond_18

    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;

    move-result-object v10

    if-eqz v10, :cond_18

    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;->a()Ljava/util/List;

    move-result-object v10

    goto :goto_c

    :cond_18
    move-object v10, v9

    .line 43
    :goto_c
    new-instance v11, Lng8;

    const/16 v12, 0x19

    invoke-direct {v11, v12}, Lng8;-><init>(B)V

    .line 44
    new-instance v12, Lvz7;

    invoke-direct {v12, v11}, Lvz7;-><init>(Ldn2;)V

    .line 45
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v11

    if-eqz v11, :cond_19

    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;

    move-result-object v11

    if-eqz v11, :cond_19

    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;

    move-result-object v11

    if-eqz v11, :cond_19

    .line 46
    sget-object v13, Lyw2;->c:Lcom/google/gson/a;

    .line 47
    invoke-virtual {v12}, Lvz7;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    .line 48
    const-class v14, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;

    .line 49
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    new-instance v15, Lyi8;

    invoke-direct {v15, v14}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 51
    invoke-virtual {v13, v12, v15}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    move-result-object v12

    .line 52
    check-cast v12, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;

    invoke-virtual {v11, v12}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;->c(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;)V

    .line 53
    :cond_19
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v11

    if-eqz v11, :cond_1c

    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;

    move-result-object v11

    if-eqz v11, :cond_1c

    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;

    move-result-object v11

    if-eqz v11, :cond_1c

    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;

    move-result-object v11

    if-eqz v11, :cond_1c

    if-eqz v0, :cond_1a

    .line 54
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_1b

    .line 55
    :cond_1a
    invoke-static {v3}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 56
    :cond_1b
    invoke-virtual {v11, v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;->c(Ljava/util/List;)V

    :cond_1c
    if-eqz v10, :cond_1d

    .line 57
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0, v10}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpSettingsBean$HeaderBean$RequestBean$HeadersBean;->b(Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_e

    .line 58
    :goto_d
    instance-of v10, v0, Ljava/lang/InterruptedException;

    if-nez v10, :cond_4a

    instance-of v10, v0, Ljava/util/concurrent/CancellationException;

    if-nez v10, :cond_4a

    .line 59
    :cond_1d
    :goto_e
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    move-object/from16 v10, p1

    invoke-virtual {v0, v5, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_23

    .line 60
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v0

    if-nez v0, :cond_1e

    .line 61
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 62
    new-instance v11, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    const/16 v12, 0x3fff

    invoke-direct {v11, v9, v9, v9, v12}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;-><init>(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;I)V

    .line 63
    invoke-virtual {v0, v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->p(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;)V

    .line 64
    :cond_1e
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;

    move-result-object v0

    goto :goto_f

    :cond_1f
    move-object v0, v9

    :goto_f
    if-nez v0, :cond_20

    .line 65
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_20

    .line 66
    new-instance v11, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;

    const/16 v12, 0xff

    invoke-direct {v11, v12}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;-><init>(I)V

    .line 67
    invoke-virtual {v0, v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->s(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;)V

    .line 68
    :cond_20
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;->a()V

    .line 69
    :cond_21
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->i()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;

    move-result-object v0

    if-eqz v0, :cond_22

    const-string v11, "ForceIP"

    invoke-virtual {v0, v11}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;->b(Ljava/lang/String;)V

    .line 70
    :cond_22
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    .line 71
    new-instance v11, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 72
    new-instance v14, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;

    .line 73
    new-instance v12, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;

    .line 74
    invoke-static {}, Ln67;->a()I

    move-result v13

    const v15, 0xffee

    .line 75
    invoke-direct {v12, v13, v15}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$ServersBean;-><init>(II)V

    .line 76
    invoke-static {v12}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const v13, 0x1ffffef

    .line 77
    invoke-direct {v14, v12, v9, v13}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;-><init>(Ljava/util/List;Ljava/util/List;I)V

    const/4 v15, 0x0

    const/16 v16, 0x78

    .line 78
    const-string v12, "antifilter"

    const-string v13, "socks"

    invoke-direct/range {v11 .. v16}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;-><init>(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;I)V

    .line 79
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v0

    if-eqz v0, :cond_24

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    move-result-object v0

    if-eqz v0, :cond_24

    invoke-virtual {v0, v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;->e(Ljava/util/List;)V

    goto :goto_10

    .line 81
    :cond_23
    invoke-static {v6}, Ld69;->v(Lsu/happ/proxyutility/dto/XRayConfig;)V

    .line 82
    :cond_24
    :goto_10
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    move-result-object v0

    const-string v11, "pref_run_without_routing"

    invoke-virtual {v0, v11, v5}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_25

    .line 83
    invoke-static {v6}, Ld69;->u(Lsu/happ/proxyutility/dto/XRayConfig;)V

    :cond_25
    const/16 v12, 0xa

    .line 84
    :try_start_2
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    move-result-object v0

    .line 85
    iget-object v0, v0, Lsu/happ/proxyutility/HappApplication;->s0:Lvz7;

    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu42;

    .line 86
    iget-object v0, v0, Lu42;->c:Lh76;

    .line 87
    iget-object v0, v0, Lh76;->X:Loh7;

    .line 88
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 89
    check-cast v0, Ljava/lang/Iterable;

    .line 90
    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v0, v12}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 91
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_26

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 92
    check-cast v14, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 93
    invoke-virtual {v14}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;->b()Ljava/lang/String;

    move-result-object v14

    .line 94
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :catchall_1
    move-exception v0

    goto :goto_12

    .line 95
    :cond_26
    sget-object v0, Ld02;->X:Ld02;

    .line 96
    invoke-static {v13, v0, v2, v6}, Ld69;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_13

    .line 97
    :goto_12
    instance-of v13, v0, Ljava/lang/InterruptedException;

    if-nez v13, :cond_49

    instance-of v13, v0, Ljava/util/concurrent/CancellationException;

    if-nez v13, :cond_49

    .line 98
    :goto_13
    invoke-static {v6}, Ld69;->f(Lsu/happ/proxyutility/dto/XRayConfig;)V

    .line 99
    invoke-static {v6}, Ld69;->e(Lsu/happ/proxyutility/dto/XRayConfig;)V

    if-eqz p3, :cond_2f

    .line 100
    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2f

    .line 101
    :try_start_3
    invoke-static {v0}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    move-result-object v10

    .line 102
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    array-length v13, v10

    if-nez v13, :cond_27

    move-object v13, v9

    goto :goto_14

    :cond_27
    aget-object v13, v10, v5

    :goto_14
    if-eqz v13, :cond_2f

    .line 104
    invoke-virtual {v13}, Ljava/net/InetAddress;->toString()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_2f

    .line 105
    invoke-static {v13, v5, v3}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2f

    .line 106
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 107
    array-length v13, v10

    move v14, v5

    :goto_15
    if-ge v14, v13, :cond_29

    aget-object v15, v10, v14

    instance-of v8, v15, Ljava/net/Inet4Address;

    if-eqz v8, :cond_28

    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :catchall_2
    move-exception v0

    goto :goto_1a

    :cond_28
    :goto_16
    add-int/lit8 v14, v14, 0x1

    const/4 v8, 0x1

    goto :goto_15

    .line 108
    :cond_29
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 109
    array-length v13, v10

    move v14, v5

    :goto_17
    if-ge v14, v13, :cond_2b

    aget-object v15, v10, v14

    instance-of v9, v15, Ljava/net/Inet6Address;

    if-eqz v9, :cond_2a

    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2a
    add-int/lit8 v14, v14, 0x1

    const/4 v9, 0x0

    goto :goto_17

    .line 110
    :cond_2b
    invoke-static {}, Ln67;->g()Z

    move-result v9

    if-eqz v9, :cond_2c

    .line 111
    invoke-static {v8, v3}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_18

    .line 112
    :cond_2c
    invoke-static {v3, v8}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    .line 113
    :goto_18
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->e()Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;

    move-result-object v8

    if-eqz v8, :cond_2d

    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;->a()Ljava/util/Map;

    move-result-object v8

    if-eqz v8, :cond_2d

    .line 114
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9, v8}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    goto :goto_19

    .line 115
    :cond_2d
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 116
    :goto_19
    invoke-static {v3}, Lmb6;->d0(Ljava/lang/Iterable;)Lb83;

    move-result-object v3

    invoke-interface {v9, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->e()Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;

    move-result-object v0

    if-eqz v0, :cond_2f

    invoke-virtual {v0, v9}, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;->c(Ljava/util/LinkedHashMap;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1b

    .line 118
    :goto_1a
    instance-of v3, v0, Ljava/lang/InterruptedException;

    if-nez v3, :cond_2e

    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    if-nez v3, :cond_2e

    goto :goto_1b

    :cond_2e
    throw v0

    :cond_2f
    :goto_1b
    if-nez v1, :cond_30

    .line 119
    invoke-static {v6}, Ld69;->b(Lsu/happ/proxyutility/dto/XRayConfig;)V

    .line 120
    :cond_30
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    move-result-object v0

    const-string v3, "pref_local_dns_enabled"

    invoke-virtual {v0, v3}, Lcom/tencent/mmkv/MMKV;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 121
    invoke-static {v6}, Ld69;->d(Lsu/happ/proxyutility/dto/XRayConfig;)V

    :cond_31
    move-object/from16 v3, p2

    .line 122
    invoke-virtual {v6, v3}, Lsu/happ/proxyutility/dto/XRayConfig;->t(Ljava/lang/String;)V

    .line 123
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    move-result-object v0

    invoke-virtual {v0, v11, v5}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 124
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    .line 125
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 126
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_32
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_34

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 127
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/EConfigType;->a()Ll22;

    move-result-object v10

    .line 128
    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v10, v12}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 129
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_33

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 130
    check-cast v13, Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 131
    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v13, v14}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    .line 133
    :cond_33
    invoke-static {v11}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v10

    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->e()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v10, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_32

    .line 134
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    .line 135
    :cond_34
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_35
    :goto_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_39

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 136
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v8

    if-eqz v8, :cond_36

    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->f()Ljava/lang/String;

    move-result-object v8

    goto :goto_1f

    :cond_36
    const/4 v8, 0x0

    :goto_1f
    sget-object v9, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->WS:Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;

    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/enums/EConfigNetworkType;->b()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_35

    .line 137
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v8

    if-eqz v8, :cond_37

    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->k()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    move-result-object v8

    if-eqz v8, :cond_37

    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->b()Ljava/util/List;

    move-result-object v8

    goto :goto_20

    :cond_37
    const/4 v8, 0x0

    :goto_20
    const-string v9, "h2"

    const-string v10, "http/1.1"

    filled-new-array {v9, v10}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-static {v8, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_35

    .line 138
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v8

    if-eqz v8, :cond_35

    .line 139
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    move-result-object v3

    if-eqz v3, :cond_38

    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->k()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    move-result-object v3

    if-eqz v3, :cond_38

    invoke-static {v10}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-static {v3, v9}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;->a(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;Ljava/util/List;)Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;

    move-result-object v3

    goto :goto_21

    :cond_38
    const/4 v3, 0x0

    .line 140
    :goto_21
    invoke-virtual {v8, v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->t(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TlsSettingsBean;)V

    goto :goto_1e

    .line 141
    :cond_39
    invoke-static {}, Ld69;->j()Lmn6;

    move-result-object v0

    invoke-static {v0}, Lmn6;->k(Lmn6;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    move-result-object v0

    if-eqz v0, :cond_3a

    .line 142
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    move-result-object v0

    if-eqz v0, :cond_3a

    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    move-result-object v0

    if-eqz v0, :cond_3a

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->t()Z

    move-result v0

    goto :goto_22

    :cond_3a
    const/4 v0, 0x1

    :goto_22
    if-nez v0, :cond_3f

    if-eqz v1, :cond_3b

    goto/16 :goto_26

    .line 143
    :cond_3b
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_43

    .line 144
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    .line 145
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v5

    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 146
    check-cast v8, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 147
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->k()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3c

    goto :goto_24

    :cond_3c
    add-int/lit8 v3, v3, 0x1

    goto :goto_23

    :cond_3d
    move v3, v7

    :goto_24
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-le v3, v7, :cond_3e

    goto :goto_25

    :cond_3e
    const/4 v0, 0x0

    :goto_25
    if-eqz v0, :cond_43

    .line 148
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 149
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-static {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->a(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;)Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    move-result-object v2

    .line 150
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v7, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-static {v7}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->a(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;)Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    move-result-object v7

    invoke-virtual {v3, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 151
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2a

    .line 152
    :cond_3f
    :goto_26
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->k()Ljava/lang/String;

    move-result-object v0

    const-string v2, "proxy"

    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_43

    .line 153
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    .line 154
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v5

    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_41

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 155
    check-cast v8, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 156
    invoke-virtual {v8}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->k()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_40

    goto :goto_28

    :cond_40
    add-int/lit8 v3, v3, 0x1

    goto :goto_27

    :cond_41
    move v3, v7

    :goto_28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-le v3, v7, :cond_42

    goto :goto_29

    :cond_42
    const/4 v0, 0x0

    :goto_29
    if-eqz v0, :cond_43

    .line 157
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 158
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v2, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-static {v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->a(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;)Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    move-result-object v2

    .line 159
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v7, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-static {v7}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->a(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;)Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    move-result-object v7

    invoke-virtual {v3, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 160
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 161
    :cond_43
    :goto_2a
    invoke-static {}, Ln67;->f()Z

    move-result v0

    if-eqz v0, :cond_47

    .line 162
    invoke-static {}, Ln67;->c()Lcom/tencent/mmkv/MMKV;

    move-result-object v0

    const-string v2, "pref_block_bindtodevice_enabled"

    invoke-virtual {v0, v2, v5}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_47

    .line 163
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_44
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_45

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->k()Ljava/lang/String;

    move-result-object v3

    const-string v7, "block"

    invoke-static {v3, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_44

    goto :goto_2b

    :cond_45
    const/4 v2, 0x0

    :goto_2b
    check-cast v2, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    if-nez v2, :cond_46

    .line 164
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    .line 165
    new-instance v7, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    const/4 v11, 0x0

    const/16 v12, 0x7c

    const-string v8, "block"

    const-string v9, "blackhole"

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;-><init>(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;I)V

    .line 166
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    :cond_46
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    move-result-object v0

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->b()Ljava/util/ArrayList;

    move-result-object v0

    .line 168
    const-string v2, "-1"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v11

    .line 169
    new-instance v7, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;

    const/4 v12, 0x0

    const/16 v13, 0x3f7b

    const/4 v8, 0x0

    const-string v9, "block"

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v13}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean$RulesBean;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V

    .line 170
    invoke-virtual {v0, v5, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_47
    if-eqz v1, :cond_48

    .line 171
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$LogBean;

    move-result-object v0

    const-string v1, "none"

    invoke-virtual {v0, v1}, Lsu/happ/proxyutility/dto/XRayConfig$LogBean;->c(Ljava/lang/String;)V

    .line 172
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 173
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    move-result-object v0

    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v1, 0x0

    .line 174
    invoke-virtual {v6, v1}, Lsu/happ/proxyutility/dto/XRayConfig;->o(Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;)V

    .line 175
    invoke-virtual {v6, v1}, Lsu/happ/proxyutility/dto/XRayConfig;->p(Ljava/util/List;)V

    .line 176
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->u()V

    .line 177
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->s()V

    .line 178
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    move-result-object v0

    .line 179
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_48

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 180
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->m()V

    goto :goto_2c

    :cond_48
    const/4 v1, 0x1

    .line 181
    iput-boolean v1, v4, Lb69;->a:Z

    .line 182
    sget-object v0, Lyw2;->d:Lcom/google/gson/a;

    .line 183
    invoke-virtual {v0, v6}, Lcom/google/gson/a;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 184
    iput-object v0, v4, Lb69;->b:Ljava/lang/String;

    return-object v4

    .line 185
    :cond_49
    throw v0

    .line 186
    :cond_4a
    throw v0
.end method

.method public static o(Lsu/happ/proxyutility/dto/XRayConfig;Z)V
    .locals 16

    .line 1
    invoke-static {}, Ln67;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, -0x1

    .line 10
    const-string v3, "pref_socks_auth_mode"

    .line 11
    .line 12
    invoke-virtual {v1, v2, v3}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v3, v4

    .line 25
    :goto_0
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->b()Ll22;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ln22;

    .line 36
    .line 37
    invoke-virtual {v3, v1}, Ln22;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    sget-object v1, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->Companion:Lsu/happ/proxyutility/dto/enums/InboundAuthMode$Companion;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->a()Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    const-string v6, "socks"

    .line 68
    .line 69
    if-eqz v5, :cond_3

    .line 70
    .line 71
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    move-object v7, v5

    .line 76
    check-cast v7, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 77
    .line 78
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->b()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-static {v8, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_2

    .line 87
    .line 88
    invoke-virtual {v7}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->a()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-ne v7, v0, :cond_2

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    move-object v5, v4

    .line 96
    :goto_2
    check-cast v5, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 97
    .line 98
    invoke-static {}, Ln67;->b()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    const-string v8, "pref_http_auth_mode"

    .line 107
    .line 108
    invoke-virtual {v7, v2, v8}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    if-eq v7, v2, :cond_4

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    move-object v8, v4

    .line 120
    :goto_3
    if-eqz v8, :cond_5

    .line 121
    .line 122
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->b()Ll22;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    check-cast v7, Ln22;

    .line 131
    .line 132
    invoke-virtual {v7, v2}, Ln22;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 137
    .line 138
    if-eqz v2, :cond_5

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_5
    sget-object v2, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->Companion:Lsu/happ/proxyutility/dto/enums/InboundAuthMode$Companion;

    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-static {}, Lsu/happ/proxyutility/dto/enums/InboundAuthMode;->a()Lsu/happ/proxyutility/dto/enums/InboundAuthMode;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    :cond_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    if-eqz v8, :cond_7

    .line 163
    .line 164
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    move-object v9, v8

    .line 169
    check-cast v9, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 170
    .line 171
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->b()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    const-string v11, "http"

    .line 176
    .line 177
    invoke-static {v10, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-eqz v10, :cond_6

    .line 182
    .line 183
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->a()I

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    if-ne v9, v3, :cond_6

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_7
    move-object v8, v4

    .line 191
    :goto_5
    check-cast v8, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 192
    .line 193
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    const-string v9, "pref_http_auth_enabled"

    .line 198
    .line 199
    invoke-virtual {v7, v9}, Lcom/tencent/mmkv/MMKV;->b(Ljava/lang/String;)Z

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    const/4 v9, 0x1

    .line 204
    if-nez v7, :cond_8

    .line 205
    .line 206
    invoke-virtual/range {p0 .. p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    new-instance v10, La69;

    .line 211
    .line 212
    const/4 v11, 0x5

    .line 213
    invoke-direct {v10, v11}, La69;-><init>(B)V

    .line 214
    .line 215
    .line 216
    new-instance v11, Lif4;

    .line 217
    .line 218
    invoke-direct {v11, v10, v9}, Lif4;-><init>(Lgn2;B)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    .line 222
    .line 223
    .line 224
    :cond_8
    sget-object v7, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 225
    .line 226
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    invoke-virtual {v7}, Lsu/happ/proxyutility/HappApplication;->e()Lc16;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    invoke-virtual/range {p0 .. p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    invoke-static {v10}, Lwv0;->l0(Ljava/lang/Iterable;)Lhu;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    new-instance v11, Ln73;

    .line 243
    .line 244
    const/4 v12, 0x2

    .line 245
    invoke-direct {v11, v0, v3, v12}, Ln73;-><init>(IIB)V

    .line 246
    .line 247
    .line 248
    new-instance v0, Lla2;

    .line 249
    .line 250
    invoke-direct {v0, v10, v9, v11}, Lla2;-><init>(Lu27;ZLgn2;)V

    .line 251
    .line 252
    .line 253
    new-instance v3, Lka2;

    .line 254
    .line 255
    invoke-direct {v3, v0}, Lka2;-><init>(Lla2;)V

    .line 256
    .line 257
    .line 258
    :goto_6
    invoke-virtual {v3}, Lka2;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_15

    .line 263
    .line 264
    invoke-virtual {v3}, Lka2;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 269
    .line 270
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->b()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    invoke-static {v10, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    if-eqz v10, :cond_9

    .line 279
    .line 280
    move-object v11, v5

    .line 281
    goto :goto_7

    .line 282
    :cond_9
    move-object v11, v8

    .line 283
    :goto_7
    if-eqz v10, :cond_a

    .line 284
    .line 285
    move-object v13, v1

    .line 286
    goto :goto_8

    .line 287
    :cond_a
    move-object v13, v2

    .line 288
    :goto_8
    if-eqz v10, :cond_b

    .line 289
    .line 290
    invoke-virtual {v7}, Lc16;->f()Lsu/happ/proxyutility/dto/AuthData;

    .line 291
    .line 292
    .line 293
    move-result-object v10

    .line 294
    goto :goto_9

    .line 295
    :cond_b
    invoke-virtual {v7}, Lc16;->d()Lsu/happ/proxyutility/dto/AuthData;

    .line 296
    .line 297
    .line 298
    move-result-object v10

    .line 299
    :goto_9
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->c()Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;

    .line 300
    .line 301
    .line 302
    move-result-object v14

    .line 303
    if-nez v14, :cond_c

    .line 304
    .line 305
    new-instance v14, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;

    .line 306
    .line 307
    const/16 v15, 0x1ff

    .line 308
    .line 309
    invoke-direct {v14, v4, v15}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;-><init>(Ljava/lang/String;I)V

    .line 310
    .line 311
    .line 312
    :cond_c
    if-eqz v11, :cond_d

    .line 313
    .line 314
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->c()Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;

    .line 315
    .line 316
    .line 317
    move-result-object v11

    .line 318
    goto :goto_a

    .line 319
    :cond_d
    move-object v11, v4

    .line 320
    :goto_a
    invoke-static {}, Ln67;->c()Lcom/tencent/mmkv/MMKV;

    .line 321
    .line 322
    .line 323
    move-result-object v15

    .line 324
    const-string v4, "pref_proxy_sharing_enabled"

    .line 325
    .line 326
    const/4 v12, 0x0

    .line 327
    invoke-virtual {v15, v4, v12}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    const-string v12, "noauth"

    .line 332
    .line 333
    if-eqz v4, :cond_e

    .line 334
    .line 335
    invoke-virtual {v14, v12}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;->b(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, v14}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->h(Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;)V

    .line 339
    .line 340
    .line 341
    const/4 v11, 0x2

    .line 342
    goto :goto_e

    .line 343
    :cond_e
    sget-object v4, Lc69;->c:[I

    .line 344
    .line 345
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 346
    .line 347
    .line 348
    move-result v13

    .line 349
    aget v4, v4, v13

    .line 350
    .line 351
    if-ne v4, v9, :cond_f

    .line 352
    .line 353
    if-eqz p1, :cond_f

    .line 354
    .line 355
    if-eqz v11, :cond_f

    .line 356
    .line 357
    move-object v14, v11

    .line 358
    :goto_b
    const/4 v11, 0x2

    .line 359
    goto :goto_d

    .line 360
    :cond_f
    if-ne v4, v9, :cond_10

    .line 361
    .line 362
    if-eqz p1, :cond_10

    .line 363
    .line 364
    invoke-virtual {v14, v12}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;->b(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    goto :goto_b

    .line 368
    :cond_10
    const/4 v11, 0x2

    .line 369
    if-ne v4, v11, :cond_11

    .line 370
    .line 371
    invoke-virtual {v14, v12}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;->b(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    goto :goto_d

    .line 375
    :cond_11
    const/4 v12, 0x3

    .line 376
    const-string v13, "password"

    .line 377
    .line 378
    if-eq v4, v12, :cond_14

    .line 379
    .line 380
    if-ne v4, v9, :cond_12

    .line 381
    .line 382
    goto :goto_c

    .line 383
    :cond_12
    const/4 v12, 0x4

    .line 384
    if-ne v4, v12, :cond_13

    .line 385
    .line 386
    invoke-virtual {v14, v13}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;->b(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    new-instance v4, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$Account;

    .line 390
    .line 391
    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/AuthData;->b()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v12

    .line 395
    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/AuthData;->a()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v10

    .line 399
    invoke-direct {v4, v12, v10}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    invoke-static {v4}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    invoke-virtual {v14, v4}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;->a(Ljava/util/List;)V

    .line 407
    .line 408
    .line 409
    goto :goto_d

    .line 410
    :cond_13
    invoke-static {}, Lb61;->c()V

    .line 411
    .line 412
    .line 413
    return-void

    .line 414
    :cond_14
    :goto_c
    invoke-virtual {v14, v13}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;->b(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    new-instance v4, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$Account;

    .line 418
    .line 419
    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/AuthData;->b()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v12

    .line 423
    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/AuthData;->a()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v10

    .line 427
    invoke-direct {v4, v12, v10}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-static {v4}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v4

    .line 434
    invoke-virtual {v14, v4}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;->a(Ljava/util/List;)V

    .line 435
    .line 436
    .line 437
    :goto_d
    invoke-virtual {v0, v14}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->h(Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;)V

    .line 438
    .line 439
    .line 440
    :goto_e
    move v12, v11

    .line 441
    const/4 v4, 0x0

    .line 442
    goto/16 :goto_6

    .line 443
    .line 444
    :cond_15
    return-void
.end method

.method public static p(Lsu/happ/proxyutility/dto/XRayConfig;Z)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "pref_sniffing_enabled"

    .line 7
    .line 8
    invoke-virtual {v1, v2, v0}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    const-string v4, "tun"

    .line 25
    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 33
    .line 34
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const-string v6, "pref_proxy_sharing_enabled"

    .line 39
    .line 40
    invoke-virtual {v5, v6}, Lcom/tencent/mmkv/MMKV;->b(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_1

    .line 45
    .line 46
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->b()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {v5, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->f()V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto/16 :goto_7

    .line 62
    .line 63
    :cond_1
    :goto_1
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->d()Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    if-nez v4, :cond_0

    .line 68
    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    new-instance v4, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;

    .line 72
    .line 73
    sget-object v5, Lsu/happ/proxyutility/dto/XRayConfig;->Companion:Lsu/happ/proxyutility/dto/XRayConfig$Companion;

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lsu/happ/proxyutility/dto/XRayConfig;->b()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    const-string v6, "tls"

    .line 83
    .line 84
    invoke-static {}, Lsu/happ/proxyutility/dto/XRayConfig;->c()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    filled-new-array {v5, v6, v7}, [Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    invoke-static {v5}, Li21;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-direct {v4, v5}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;-><init>(Ljava/util/ArrayList;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v4}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->i(Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    const/4 v5, 0x0

    .line 116
    if-eqz v3, :cond_4

    .line 117
    .line 118
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    move-object v6, v3

    .line 123
    check-cast v6, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 124
    .line 125
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->b()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const-string v7, "socks"

    .line 130
    .line 131
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_3

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_4
    move-object v3, v5

    .line 139
    :goto_2
    check-cast v3, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 140
    .line 141
    if-eqz v3, :cond_5

    .line 142
    .line 143
    invoke-static {}, Ln67;->d()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    invoke-virtual {v3, v2}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->g(I)V

    .line 148
    .line 149
    .line 150
    :cond_5
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_7

    .line 163
    .line 164
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    move-object v6, v3

    .line 169
    check-cast v6, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 170
    .line 171
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->b()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    const-string v7, "http"

    .line 176
    .line 177
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-eqz v6, :cond_6

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_7
    move-object v3, v5

    .line 185
    :goto_3
    check-cast v3, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 186
    .line 187
    if-eqz v3, :cond_8

    .line 188
    .line 189
    invoke-static {}, Ln67;->b()I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    invoke-virtual {v3, v2}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->g(I)V

    .line 194
    .line 195
    .line 196
    :cond_8
    invoke-static {}, Ld69;->j()Lmn6;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {v2}, Lmn6;->k(Lmn6;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    const/4 v3, 0x0

    .line 205
    if-eqz v2, :cond_9

    .line 206
    .line 207
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    if-eqz v2, :cond_9

    .line 212
    .line 213
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    if-eqz v2, :cond_9

    .line 218
    .line 219
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/RouteSettings;->q()Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    goto :goto_4

    .line 224
    :cond_9
    move v2, v3

    .line 225
    :goto_4
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    check-cast v6, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 234
    .line 235
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->d()Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    if-eqz v6, :cond_c

    .line 240
    .line 241
    if-nez v2, :cond_b

    .line 242
    .line 243
    if-eqz v1, :cond_a

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_a
    move v7, v3

    .line 247
    goto :goto_6

    .line 248
    :cond_b
    :goto_5
    move v7, v0

    .line 249
    :goto_6
    invoke-virtual {v6, v7}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;->b(Z)V

    .line 250
    .line 251
    .line 252
    :cond_c
    if-nez v1, :cond_d

    .line 253
    .line 254
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    check-cast v1, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 263
    .line 264
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->d()Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    if-eqz v1, :cond_d

    .line 269
    .line 270
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;->a()Ljava/util/ArrayList;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    if-eqz v1, :cond_d

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 277
    .line 278
    .line 279
    :cond_d
    if-eqz v2, :cond_e

    .line 280
    .line 281
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    check-cast v1, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 290
    .line 291
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->d()Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    if-eqz v1, :cond_e

    .line 296
    .line 297
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$SniffingBean;->a()Ljava/util/ArrayList;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    if-eqz v1, :cond_e

    .line 302
    .line 303
    const-string v2, "fakedns"

    .line 304
    .line 305
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    :cond_e
    invoke-static {}, Ln67;->f()Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-eqz v1, :cond_11

    .line 313
    .line 314
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->f()Ljava/util/ArrayList;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    :cond_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    if-eqz v2, :cond_10

    .line 327
    .line 328
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    move-object v6, v2

    .line 333
    check-cast v6, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 334
    .line 335
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->e()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    invoke-static {v6, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v6

    .line 343
    if-eqz v6, :cond_f

    .line 344
    .line 345
    move-object v5, v2

    .line 346
    :cond_10
    check-cast v5, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 347
    .line 348
    if-eqz v5, :cond_11

    .line 349
    .line 350
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->c()Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    if-eqz v1, :cond_11

    .line 355
    .line 356
    sget-object v2, Ln67;->a:Lvz7;

    .line 357
    .line 358
    sget-object v2, Lss8;->a:Lss8;

    .line 359
    .line 360
    invoke-static {}, Ln67;->c()Lcom/tencent/mmkv/MMKV;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    const-string v4, "pref_tun_mtu"

    .line 365
    .line 366
    invoke-virtual {v2, v4}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    const/16 v4, 0x5dc

    .line 371
    .line 372
    invoke-static {v4, v2}, Lss8;->C(ILjava/lang/String;)I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-virtual {v1, v2}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean$InSettingsBean;->c(Ljava/lang/Integer;)V

    .line 381
    .line 382
    .line 383
    :cond_11
    if-nez p1, :cond_12

    .line 384
    .line 385
    invoke-static {p0, v3}, Ld69;->o(Lsu/happ/proxyutility/dto/XRayConfig;Z)V

    .line 386
    .line 387
    .line 388
    :cond_12
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 389
    .line 390
    goto :goto_8

    .line 391
    :goto_7
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 392
    .line 393
    if-nez p1, :cond_13

    .line 394
    .line 395
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 396
    .line 397
    if-nez p1, :cond_13

    .line 398
    .line 399
    new-instance p1, Lrj6;

    .line 400
    .line 401
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 402
    .line 403
    .line 404
    move-object p0, p1

    .line 405
    :goto_8
    instance-of p0, p0, Lrj6;

    .line 406
    .line 407
    xor-int/2addr p0, v0

    .line 408
    return p0

    .line 409
    :cond_13
    throw p0
.end method

.method public static q(Landroid/content/Context;Z)Lsu/happ/proxyutility/dto/XRayConfig;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Ln67;->f()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    sget-object p1, Lss8;->a:Lss8;

    .line 11
    .line 12
    const-string p1, "xray_config_with_tun.json"

    .line 13
    .line 14
    invoke-static {p0, p1}, Lss8;->D(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    sget-object p1, Lss8;->a:Lss8;

    .line 22
    .line 23
    const-string p1, "xray_config.json"

    .line 24
    .line 25
    invoke-static {p0, p1}, Lss8;->D(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_1
    sget-object p1, Lyw2;->c:Lcom/google/gson/a;

    .line 37
    .line 38
    const-class v1, Lsu/happ/proxyutility/dto/XRayConfig;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v2, Lyi8;

    .line 44
    .line 45
    invoke-direct {v2, v1}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p0, v2}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Lsu/happ/proxyutility/dto/XRayConfig;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :goto_1
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 60
    .line 61
    if-nez p1, :cond_3

    .line 62
    .line 63
    new-instance p1, Lrj6;

    .line 64
    .line 65
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    move-object p0, p1

    .line 69
    :goto_2
    nop

    .line 70
    instance-of p1, p0, Lrj6;

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_2
    move-object v0, p0

    .line 76
    :goto_3
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig;

    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_3
    throw p0
.end method

.method public static r(Lsu/happ/proxyutility/dto/XRayConfig;Ljava/lang/String;Z)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object v0, Le69;->Z:Lf08;

    .line 5
    .line 6
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "pref_logs_type"

    .line 11
    .line 12
    const/4 v3, -0x1

    .line 13
    invoke-virtual {v1, v3, v2}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lf08;->i(I)Le69;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "pref_logs_hidden"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lcom/tencent/mmkv/MMKV;->b(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    sget-object v0, Le69;->g0:Le69;

    .line 37
    .line 38
    :cond_0
    if-nez p2, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$LogBean;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-static {}, Ld69;->i()Lkf4;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1, p1}, Lkf4;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    const-string v1, ""

    .line 53
    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    move-object p1, v1

    .line 57
    :cond_1
    :try_start_1
    invoke-virtual {p2, p1}, Lsu/happ/proxyutility/dto/XRayConfig$LogBean;->b(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$LogBean;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {}, Ld69;->i()Lkf4;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p2}, Lkf4;->d()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    if-nez p2, :cond_2

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    move-object v1, p2

    .line 76
    :goto_0
    invoke-virtual {p1, v1}, Lsu/happ/proxyutility/dto/XRayConfig$LogBean;->a(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$LogBean;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    iget-object p1, v0, Le69;->X:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lsu/happ/proxyutility/dto/XRayConfig$LogBean;->c(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 93
    .line 94
    if-nez p1, :cond_4

    .line 95
    .line 96
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 97
    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    new-instance p1, Lrj6;

    .line 101
    .line 102
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    move-object p0, p1

    .line 106
    :goto_1
    instance-of p0, p0, Lrj6;

    .line 107
    .line 108
    xor-int/lit8 p0, p0, 0x1

    .line 109
    .line 110
    return p0

    .line 111
    :cond_4
    throw p0
.end method

.method public static s(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-static {}, Ln67;->c()Lcom/tencent/mmkv/MMKV;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "pref_resolve_server_before_start_enabled"

    .line 10
    .line 11
    invoke-virtual {v1, v2, v0}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v1, Lkw4;->a:Lkw4;

    .line 19
    .line 20
    invoke-static {p0}, Lkw4;->b(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerConfig;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    :goto_0
    return v0

    .line 27
    :cond_1
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ServerConfig;->c()Lsu/happ/proxyutility/dto/enums/EConfigType;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v2, Lc69;->a:[I

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    aget v1, v2, v1

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    if-ne v1, v2, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/ServerConfig;->g()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->g()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_3

    .line 54
    .line 55
    sget-object v1, Lss8;->a:Lss8;

    .line 56
    .line 57
    invoke-static {p0}, Lss8;->u(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_3

    .line 62
    .line 63
    return v2

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    :goto_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :goto_2
    instance-of v1, p0, Ljava/lang/InterruptedException;

    .line 70
    .line 71
    if-nez v1, :cond_6

    .line 72
    .line 73
    instance-of v1, p0, Ljava/util/concurrent/CancellationException;

    .line 74
    .line 75
    if-nez v1, :cond_6

    .line 76
    .line 77
    new-instance v1, Lrj6;

    .line 78
    .line 79
    invoke-direct {v1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    move-object p0, v1

    .line 83
    :goto_3
    nop

    .line 84
    instance-of v1, p0, Lrj6;

    .line 85
    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    :cond_4
    check-cast p0, Ljava/lang/Boolean;

    .line 90
    .line 91
    if-eqz p0, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    :cond_5
    return v0

    .line 98
    :cond_6
    throw p0
.end method

.method public static t(Lsu/happ/proxyutility/dto/XRayConfig;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->d()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->e()Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;->a()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-static {}, Ln67;->g()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_6

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 47
    .line 48
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->g()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-nez v5, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-nez v5, :cond_1

    .line 66
    .line 67
    invoke-static {v4, v1}, Lfr1;->c(Ljava/lang/String;Z)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    if-eqz v5, :cond_1

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->b()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    const-string v6, "UseIPv6v4"

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    const-string v6, "UseIPv4v6"

    .line 90
    .line 91
    :goto_2
    invoke-virtual {v3, v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;->b(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    const/4 v6, 0x1

    .line 99
    if-ne v3, v6, :cond_5

    .line 100
    .line 101
    const/4 v3, 0x0

    .line 102
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    :cond_5
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    if-eqz p0, :cond_7

    .line 111
    .line 112
    invoke-virtual {p0, v2}, Lsu/happ/proxyutility/dto/XRayConfig$DnsBean;->c(Ljava/util/LinkedHashMap;)V

    .line 113
    .line 114
    .line 115
    :cond_7
    return-void
.end method

.method public static u(Lsu/happ/proxyutility/dto/XRayConfig;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-static {}, Ld69;->j()Lmn6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lmn6;->k(Lmn6;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/RouteSettings;->B()Lsu/happ/proxyutility/dto/enums/RoutingOrder;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2}, Lsu/happ/proxyutility/dto/enums/RoutingOrderKt;->a(Lsu/happ/proxyutility/dto/enums/RoutingOrder;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lsu/happ/proxyutility/dto/enums/ERoutingSettingsType;

    .line 46
    .line 47
    sget-object v4, Lc69;->d:[I

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    aget v3, v4, v3

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    if-eq v3, v4, :cond_2

    .line 57
    .line 58
    const/4 v4, 0x2

    .line 59
    if-eq v3, v4, :cond_1

    .line 60
    .line 61
    const/4 v4, 0x3

    .line 62
    if-ne v3, v4, :cond_0

    .line 63
    .line 64
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/RouteSettings;->f()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/RouteSettings;->g()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    const-string v5, "block"

    .line 73
    .line 74
    invoke-static {v3, v4, v5, p0}, Ld69;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    new-instance p0, Lb55;

    .line 79
    .line 80
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :cond_1
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/RouteSettings;->j()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/RouteSettings;->k()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    const-string v5, "direct"

    .line 93
    .line 94
    invoke-static {v3, v4, v5, p0}, Ld69;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/RouteSettings;->w()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/RouteSettings;->x()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    const-string v5, "proxy"

    .line 107
    .line 108
    invoke-static {v3, v4, v5, p0}, Ld69;->a(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsu/happ/proxyutility/dto/XRayConfig;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    invoke-virtual {p0}, Lsu/happ/proxyutility/dto/XRayConfig;->l()Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-eqz v0, :cond_4

    .line 117
    .line 118
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->b()Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_4

    .line 123
    .line 124
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RouteSettings;->m()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    :cond_4
    const-string v0, "IPIfNonMatch"

    .line 137
    .line 138
    :cond_5
    invoke-virtual {p0, v0}, Lsu/happ/proxyutility/dto/XRayConfig$RoutingBean;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :catchall_0
    move-exception p0

    .line 143
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 144
    .line 145
    if-nez v0, :cond_6

    .line 146
    .line 147
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 148
    .line 149
    if-nez v0, :cond_6

    .line 150
    .line 151
    :goto_1
    return-void

    .line 152
    :cond_6
    throw p0
.end method

.method public static v(Lsu/happ/proxyutility/dto/XRayConfig;)V
    .locals 19

    .line 1
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lsu/happ/proxyutility/dto/XRayConfig;->i()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v0, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 14
    .line 15
    sget-object v2, Lsu/happ/proxyutility/dto/enums/FragmentationType;->Companion:Lsu/happ/proxyutility/dto/enums/FragmentationType$Companion;

    .line 16
    .line 17
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "pref_fragment_type"

    .line 22
    .line 23
    const-string v5, "XRAY"

    .line 24
    .line 25
    invoke-virtual {v3, v4, v5}, Lcom/tencent/mmkv/MMKV;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v3}, Lsu/happ/proxyutility/dto/enums/FragmentationType$Companion;->a(Ljava/lang/String;)Lsu/happ/proxyutility/dto/enums/FragmentationType;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "pref_fragment_enabled"

    .line 41
    .line 42
    invoke-virtual {v3, v4, v1}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    const/4 v4, 0x1

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    sget-object v3, Lsu/happ/proxyutility/dto/enums/FragmentationType;->XRAY:Lsu/happ/proxyutility/dto/enums/FragmentationType;

    .line 50
    .line 51
    if-ne v2, v3, :cond_0

    .line 52
    .line 53
    move v3, v4

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v3, v1

    .line 56
    :goto_0
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    const/4 v6, 0x0

    .line 61
    if-eqz v5, :cond_1

    .line 62
    .line 63
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->a()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move-object v5, v6

    .line 69
    :goto_1
    if-nez v5, :cond_1d

    .line 70
    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    goto/16 :goto_15

    .line 74
    .line 75
    :cond_2
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-eqz v3, :cond_3

    .line 80
    .line 81
    new-instance v5, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 82
    .line 83
    const/4 v7, 0x7

    .line 84
    invoke-direct {v5, v6, v6, v7}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;-><init>(Ljava/util/List;Ljava/util/List;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v5}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->o(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const-string v5, "pref_fragment_packets"

    .line 95
    .line 96
    invoke-virtual {v3, v5}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    if-eqz v3, :cond_5

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-lez v5, :cond_4

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v3, v6

    .line 110
    :goto_2
    if-eqz v3, :cond_5

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    const-string v3, "tlshello"

    .line 114
    .line 115
    :goto_3
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    const-string v7, "pref_fragment_length"

    .line 120
    .line 121
    invoke-virtual {v5, v7}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    if-eqz v5, :cond_7

    .line 126
    .line 127
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-lez v7, :cond_6

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_6
    move-object v5, v6

    .line 135
    :goto_4
    if-eqz v5, :cond_7

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_7
    const-string v5, "50-100"

    .line 139
    .line 140
    :goto_5
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    const-string v8, "pref_fragment_interval"

    .line 145
    .line 146
    invoke-virtual {v7, v8}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    if-eqz v7, :cond_9

    .line 151
    .line 152
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-lez v8, :cond_8

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_8
    move-object v7, v6

    .line 160
    :goto_6
    if-eqz v7, :cond_9

    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_9
    const-string v7, "10-20"

    .line 164
    .line 165
    :goto_7
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    const-string v9, "pref_fragment_max_split"

    .line 170
    .line 171
    invoke-virtual {v8, v9}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    if-eqz v8, :cond_b

    .line 176
    .line 177
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    if-lez v9, :cond_a

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :cond_a
    move-object v8, v6

    .line 185
    :goto_8
    if-eqz v8, :cond_b

    .line 186
    .line 187
    goto :goto_9

    .line 188
    :cond_b
    const-string v8, "100-200"

    .line 189
    .line 190
    :goto_9
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    const-string v10, "pref_noises_enabled"

    .line 195
    .line 196
    invoke-virtual {v9, v10, v1}, Lcom/tencent/mmkv/MMKV;->c(Ljava/lang/String;Z)Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-eqz v9, :cond_c

    .line 201
    .line 202
    sget-object v9, Lsu/happ/proxyutility/dto/enums/FragmentationType;->XRAY:Lsu/happ/proxyutility/dto/enums/FragmentationType;

    .line 203
    .line 204
    if-ne v2, v9, :cond_c

    .line 205
    .line 206
    goto :goto_a

    .line 207
    :cond_c
    move v4, v1

    .line 208
    :goto_a
    if-eqz v4, :cond_d

    .line 209
    .line 210
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    const-string v9, "pref_noises_delay"

    .line 215
    .line 216
    invoke-virtual {v2, v9}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    goto :goto_b

    .line 221
    :cond_d
    move-object v2, v6

    .line 222
    :goto_b
    if-eqz v2, :cond_e

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 225
    .line 226
    .line 227
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 228
    if-lez v9, :cond_e

    .line 229
    .line 230
    goto :goto_c

    .line 231
    :cond_e
    move-object v2, v6

    .line 232
    :goto_c
    const-string v9, "array"

    .line 233
    .line 234
    if-eqz v4, :cond_f

    .line 235
    .line 236
    :try_start_1
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    const-string v11, "pref_noises_type"

    .line 241
    .line 242
    invoke-virtual {v10, v11}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v10

    .line 246
    if-nez v10, :cond_10

    .line 247
    .line 248
    move-object v10, v9

    .line 249
    goto :goto_d

    .line 250
    :cond_f
    move-object v10, v6

    .line 251
    :cond_10
    :goto_d
    if-eqz v10, :cond_11

    .line 252
    .line 253
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 254
    .line 255
    .line 256
    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 257
    if-lez v11, :cond_11

    .line 258
    .line 259
    goto :goto_e

    .line 260
    :cond_11
    move-object v10, v6

    .line 261
    :goto_e
    const-string v11, "pref_noises_packet"

    .line 262
    .line 263
    if-eqz v4, :cond_14

    .line 264
    .line 265
    :try_start_2
    invoke-static {v10, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v9

    .line 269
    if-eqz v9, :cond_14

    .line 270
    .line 271
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    invoke-virtual {v9, v11}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    if-eqz v9, :cond_15

    .line 280
    .line 281
    const-string v11, ","

    .line 282
    .line 283
    filled-new-array {v11}, [Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v11

    .line 287
    const/4 v12, 0x6

    .line 288
    invoke-static {v9, v11, v12}, Lfm7;->F0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    new-instance v11, Ljava/util/ArrayList;

    .line 293
    .line 294
    const/16 v12, 0xa

    .line 295
    .line 296
    invoke-static {v9, v12}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 297
    .line 298
    .line 299
    move-result v12

    .line 300
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    :goto_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v12

    .line 311
    if-eqz v12, :cond_12

    .line 312
    .line 313
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v12

    .line 317
    check-cast v12, Ljava/lang/String;

    .line 318
    .line 319
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 320
    .line 321
    .line 322
    move-result v12

    .line 323
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 324
    .line 325
    .line 326
    move-result-object v12

    .line 327
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    goto :goto_f

    .line 331
    :cond_12
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    if-nez v9, :cond_13

    .line 336
    .line 337
    goto :goto_10

    .line 338
    :cond_13
    move-object v11, v6

    .line 339
    :goto_10
    if-eqz v11, :cond_15

    .line 340
    .line 341
    new-array v1, v1, [Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-interface {v11, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    check-cast v1, [Ljava/lang/Integer;

    .line 348
    .line 349
    goto :goto_11

    .line 350
    :cond_14
    if-eqz v4, :cond_15

    .line 351
    .line 352
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-virtual {v1, v11}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    if-eqz v1, :cond_15

    .line 361
    .line 362
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 363
    .line 364
    .line 365
    move-result v9

    .line 366
    if-lez v9, :cond_15

    .line 367
    .line 368
    goto :goto_11

    .line 369
    :cond_15
    move-object v1, v6

    .line 370
    :goto_11
    if-eqz v1, :cond_16

    .line 371
    .line 372
    goto :goto_12

    .line 373
    :cond_16
    move-object v10, v6

    .line 374
    :goto_12
    if-eqz v1, :cond_18

    .line 375
    .line 376
    :cond_17
    move-object v9, v6

    .line 377
    goto :goto_13

    .line 378
    :cond_18
    if-eqz v4, :cond_17

    .line 379
    .line 380
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 381
    .line 382
    .line 383
    move-result-object v9

    .line 384
    const-string v11, "pref_noises_rand"

    .line 385
    .line 386
    invoke-virtual {v9, v11}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v9

    .line 390
    if-nez v9, :cond_19

    .line 391
    .line 392
    const-string v9, "1-8192"

    .line 393
    .line 394
    :cond_19
    :goto_13
    if-eqz v4, :cond_1a

    .line 395
    .line 396
    invoke-static {}, Ld69;->k()Lcom/tencent/mmkv/MMKV;

    .line 397
    .line 398
    .line 399
    move-result-object v11

    .line 400
    const-string v12, "pref_noises_rand_range"

    .line 401
    .line 402
    invoke-virtual {v11, v12}, Lcom/tencent/mmkv/MMKV;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v11

    .line 406
    goto :goto_14

    .line 407
    :cond_1a
    move-object v11, v6

    .line 408
    :goto_14
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 409
    .line 410
    .line 411
    move-result-object v12

    .line 412
    if-nez v12, :cond_1b

    .line 413
    .line 414
    new-instance v12, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 415
    .line 416
    const/16 v13, 0x3fff

    .line 417
    .line 418
    invoke-direct {v12, v6, v6, v6, v13}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;-><init>(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$HysteriaSettingsBean;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$SockoptBean;I)V

    .line 419
    .line 420
    .line 421
    :cond_1b
    invoke-virtual {v0, v12}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->p(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->j()Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    if-eqz v0, :cond_1e

    .line 429
    .line 430
    new-instance v12, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;

    .line 431
    .line 432
    invoke-static {v8, v7, v5, v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean$TcpMaskSettingBean;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    invoke-direct {v12, v3}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$TcpMasksBean;-><init>(Ljava/util/LinkedHashMap;)V

    .line 437
    .line 438
    .line 439
    invoke-static {v12}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    if-eqz v4, :cond_1c

    .line 444
    .line 445
    new-instance v8, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;

    .line 446
    .line 447
    const-string v12, "noise"

    .line 448
    .line 449
    move-object v6, v1

    .line 450
    new-instance v1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;

    .line 451
    .line 452
    move-object v5, v2

    .line 453
    move-object v3, v9

    .line 454
    move-object v2, v10

    .line 455
    move-object v4, v11

    .line 456
    invoke-direct/range {v1 .. v6}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$OutSettingsBean$NoisesBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/Serializable;)V

    .line 457
    .line 458
    .line 459
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 460
    .line 461
    .line 462
    move-result-object v15

    .line 463
    const/16 v17, 0x0

    .line 464
    .line 465
    const/16 v18, 0x1ef

    .line 466
    .line 467
    const/4 v13, 0x0

    .line 468
    const/4 v14, 0x0

    .line 469
    const/16 v16, 0x0

    .line 470
    .line 471
    invoke-static/range {v13 .. v18}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean$UdpMaskSettingBean;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)Ljava/util/LinkedHashMap;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-direct {v8, v12, v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$UdpMasksBean;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 476
    .line 477
    .line 478
    invoke-static {v8}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    :cond_1c
    new-instance v1, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;

    .line 483
    .line 484
    const/4 v2, 0x4

    .line 485
    invoke-direct {v1, v7, v6, v2}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;-><init>(Ljava/util/List;Ljava/util/List;I)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0, v1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean;->o(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean$StreamSettingsBean$FinalMaskBean;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 489
    .line 490
    .line 491
    goto :goto_16

    .line 492
    :cond_1d
    :goto_15
    return-void

    .line 493
    :catchall_0
    move-exception v0

    .line 494
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 495
    .line 496
    if-nez v1, :cond_1f

    .line 497
    .line 498
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 499
    .line 500
    if-nez v1, :cond_1f

    .line 501
    .line 502
    :cond_1e
    :goto_16
    return-void

    .line 503
    :cond_1f
    throw v0
.end method
