.class public final Lgw5;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lvz7;

.field public c:Lfn6;

.field public final d:Loh7;

.field public final e:Lh76;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldw4;

    .line 5
    .line 6
    const/16 v1, 0x19

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldw4;-><init>(B)V

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
    iput-object v1, p0, Lgw5;->b:Lvz7;

    .line 17
    .line 18
    new-instance v2, Lcw5;

    .line 19
    .line 20
    sget-object v0, Lsu/happ/proxyutility/domain/sub/SubId;->Companion:Lcn7;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lsu/happ/proxyutility/domain/sub/SubId;->c()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, ""

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-direct/range {v2 .. v7}, Lcw5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lgw5;->d:Loh7;

    .line 42
    .line 43
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lgw5;->e:Lh76;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final e(Lfw5;)V
    .locals 7

    .line 1
    instance-of v0, p1, Ldw5;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Ldw5;

    .line 6
    .line 7
    iget-object v1, p1, Ldw5;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p1, Ldw5;->b:Ljava/lang/String;

    .line 10
    .line 11
    iget-boolean v5, p1, Ldw5;->c:Z

    .line 12
    .line 13
    iget-object v4, p1, Ldw5;->d:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v2, p1, Ldw5;->e:Ljava/lang/String;

    .line 16
    .line 17
    iget-object p1, p1, Ldw5;->f:Lfn6;

    .line 18
    .line 19
    iput-object p1, p0, Lgw5;->c:Lfn6;

    .line 20
    .line 21
    iget-object v6, p0, Lgw5;->d:Loh7;

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v6}, Loh7;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    move-object p1, p0

    .line 31
    check-cast p1, Lcw5;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v0, Lcw5;

    .line 43
    .line 44
    invoke-direct/range {v0 .. v5}, Lcw5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, p0, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    instance-of p1, p1, Lew5;

    .line 55
    .line 56
    if-eqz p1, :cond_6

    .line 57
    .line 58
    iget-object p1, p0, Lgw5;->e:Lh76;

    .line 59
    .line 60
    iget-object v0, p1, Lh76;->X:Loh7;

    .line 61
    .line 62
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lcw5;

    .line 67
    .line 68
    iget-object v0, v0, Lcw5;->e:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v1, p0, Lgw5;->b:Lvz7;

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Lmn6;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Lmn6;->f(Ljava/lang/String;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    instance-of v3, v0, Lrj6;

    .line 89
    .line 90
    if-eqz v3, :cond_2

    .line 91
    .line 92
    move-object v0, v2

    .line 93
    :cond_2
    check-cast v0, Lsu/happ/proxyutility/dto/ProfileRoutingSettings;

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Lmn6;

    .line 103
    .line 104
    iget-object v1, p1, Lh76;->X:Loh7;

    .line 105
    .line 106
    invoke-virtual {v1}, Loh7;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Lcw5;

    .line 111
    .line 112
    iget-object v1, v1, Lcw5;->a:Ljava/lang/String;

    .line 113
    .line 114
    if-eqz v1, :cond_4

    .line 115
    .line 116
    new-instance v3, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;

    .line 117
    .line 118
    invoke-direct {v3, v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_4
    move-object v3, v2

    .line 123
    :goto_0
    if-eqz v3, :cond_5

    .line 124
    .line 125
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;->c()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {v1}, Lmn6;->d(Ljava/lang/String;)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iget-object p1, p1, Lh76;->X:Loh7;

    .line 137
    .line 138
    invoke-virtual {p1}, Loh7;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Lcw5;

    .line 143
    .line 144
    iget-object p1, p1, Lcw5;->c:Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v0, p1}, Lys0;->e0(Lsu/happ/proxyutility/dto/RouteSettings;Ljava/lang/String;)Lsu/happ/proxyutility/dto/ProfileRoutingSettings;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    :goto_1
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance v1, Ljy2;

    .line 155
    .line 156
    const/16 v3, 0x15

    .line 157
    .line 158
    invoke-direct {v1, p0, v0, v2, v3}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 159
    .line 160
    .line 161
    const/4 p0, 0x3

    .line 162
    invoke-static {p1, v2, v1, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_5
    const-string p0, "Required value was null."

    .line 167
    .line 168
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_6
    invoke-static {}, Lb61;->c()V

    .line 173
    .line 174
    .line 175
    return-void
.end method
