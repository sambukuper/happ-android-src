.class public final Ldr2;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lvz7;

.field public final c:Loh7;

.field public final d:Lh76;

.field public final e:Lu77;

.field public final f:Lf76;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj72;

    .line 5
    .line 6
    const/16 v1, 0xe

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

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
    iput-object v1, p0, Ldr2;->b:Lvz7;

    .line 17
    .line 18
    new-instance v0, Lpq2;

    .line 19
    .line 20
    sget-object v1, Lec7;->Y:Lec7;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v0, v1, v2}, Lpq2;-><init>(Lb83;Z)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Ldr2;->c:Loh7;

    .line 31
    .line 32
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Ldr2;->d:Lh76;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    const/4 v1, 0x7

    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v2, v1, v0}, Lv77;->b(IILl90;)Lu77;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Ldr2;->e:Lu77;

    .line 46
    .line 47
    invoke-static {v0}, Ljm4;->m(Lu77;)Lf76;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Ldr2;->f:Lf76;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final e(Lyq2;)V
    .locals 9

    .line 1
    instance-of v0, p1, Lvq2;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object v2, p0, Ldr2;->c:Loh7;

    .line 5
    .line 6
    const/4 v7, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, Lpq2;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-static {v0, v7, v3}, Lpq2;->a(Lpq2;Lb83;I)Lpq2;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v2, p1, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    new-instance v0, Lzq2;

    .line 38
    .line 39
    invoke-direct {v0, p0, v7, v3}, Lzq2;-><init>(Ldr2;Lq51;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v7, v0, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    instance-of v0, p1, Luq2;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    move-object v0, p1

    .line 58
    check-cast v0, Lpq2;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sget-object v3, Lec7;->Y:Lec7;

    .line 64
    .line 65
    const/4 v4, 0x2

    .line 66
    invoke-static {v0, v3, v4}, Lpq2;->a(Lpq2;Lb83;I)Lpq2;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v2, p1, v0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v0, Lzq2;

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    invoke-direct {v0, p0, v7, v2}, Lzq2;-><init>(Ldr2;Lq51;B)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v7, v0, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    instance-of v0, p1, Lwq2;

    .line 91
    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    check-cast p1, Lwq2;

    .line 95
    .line 96
    iget-object p1, p1, Lwq2;->a:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    new-instance v2, Lq0;

    .line 103
    .line 104
    const/16 v3, 0x1c

    .line 105
    .line 106
    invoke-direct {v2, p0, p1, v7, v3}, Lq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0, v7, v2, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_4
    instance-of v0, p1, Lxq2;

    .line 114
    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    check-cast p1, Lxq2;

    .line 118
    .line 119
    iget-object v6, p1, Lxq2;->a:Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;

    .line 120
    .line 121
    iget-object p1, p0, Ldr2;->b:Lvz7;

    .line 122
    .line 123
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Lmn6;

    .line 128
    .line 129
    invoke-virtual {v6}, Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;->d()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    sget-object v2, Lmn6;->j:Lvz7;

    .line 134
    .line 135
    invoke-virtual {p1, v0, v7}, Lmn6;->n(Ljava/lang/String;Ljava/lang/String;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    if-nez v5, :cond_5

    .line 140
    .line 141
    return-void

    .line 142
    :cond_5
    invoke-static {p0}, Lzw8;->a(Lxw8;)Ltu0;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    new-instance v3, Lr0;

    .line 147
    .line 148
    const/16 v8, 0x17

    .line 149
    .line 150
    move-object v4, p0

    .line 151
    invoke-direct/range {v3 .. v8}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 152
    .line 153
    .line 154
    invoke-static {p1, v7, v3, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_6
    invoke-static {}, Lb61;->c()V

    .line 159
    .line 160
    .line 161
    return-void
.end method
