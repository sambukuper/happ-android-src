.class public final Lzt7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lcom/tencent/mmkv/MMKV;

.field public final b:Lcom/tencent/mmkv/MMKV;

.field public final c:Loh7;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    sget-object v0, Lkw4;->a:Lkw4;

    .line 2
    .line 3
    invoke-static {}, Lkw4;->m()Lcom/tencent/mmkv/MMKV;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lkw4;->i:Lvz7;

    .line 8
    .line 9
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v1, Lcom/tencent/mmkv/MMKV;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lzt7;->a:Lcom/tencent/mmkv/MMKV;

    .line 25
    .line 26
    iput-object v1, p0, Lzt7;->b:Lcom/tencent/mmkv/MMKV;

    .line 27
    .line 28
    sget-object v0, Ldm5;->f0:Ldm5;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iput-object v2, p0, Lzt7;->c:Loh7;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/tencent/mmkv/MMKV;->a()[Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    new-array v1, v1, [Ljava/lang/String;

    .line 47
    .line 48
    :cond_0
    invoke-static {v1}, Leu;->Y([Ljava/lang/Object;)Lu27;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    new-instance v3, Lt16;

    .line 53
    .line 54
    const/16 v4, 0x1b

    .line 55
    .line 56
    invoke-direct {v3, p0, v4}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v3}, Lw27;->m0(Lu27;Lgn2;)Lla2;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance v1, Lzx6;

    .line 64
    .line 65
    const/16 v3, 0xd

    .line 66
    .line 67
    invoke-direct {v1, v3}, Lzx6;-><init>(B)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v1}, Lw27;->m0(Lu27;Lgn2;)Lla2;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v1, Lem5;

    .line 78
    .line 79
    invoke-direct {v1, v0}, Lem5;-><init>(Ldm5;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v1, p0}, Lzp4;->M(Ljava/util/AbstractMap;Lla2;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lem5;->f()Lcm5;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    :cond_1
    invoke-virtual {v2}, Loh7;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    move-object v1, v0

    .line 94
    check-cast v1, Lcm5;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v0, p0}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_1

    .line 104
    .line 105
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lqs7;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lzt7;->c:Loh7;

    .line 5
    .line 6
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lcm5;

    .line 11
    .line 12
    new-instance v0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lqs7;

    .line 22
    .line 23
    return-object p0
.end method

.method public final b(Ljava/lang/String;Lgn2;)Lqs7;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lzt7;->c:Loh7;

    .line 5
    .line 6
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lcm5;

    .line 11
    .line 12
    new-instance v2, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 13
    .line 14
    invoke-direct {v2, p1}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lqs7;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Lqs7;

    .line 26
    .line 27
    invoke-direct {v1}, Lqs7;-><init>()V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-interface {p2, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Lqs7;

    .line 35
    .line 36
    invoke-static {p1}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    move-object v1, p1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v1, 0x0

    .line 45
    :goto_0
    if-nez v1, :cond_2

    .line 46
    .line 47
    const-string v1, "Server-List"

    .line 48
    .line 49
    :cond_2
    sget-object v2, Lmr;->a:Lcp3;

    .line 50
    .line 51
    iget-object v3, v2, Lvm3;->b:Lg55;

    .line 52
    .line 53
    sget-object v3, Lqs7;->Companion:Ljs7;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljs7;->serializer()Low3;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Low3;

    .line 60
    .line 61
    invoke-virtual {v2, v3, p2}, Lvm3;->b(Low3;Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object p0, p0, Lzt7;->b:Lcom/tencent/mmkv/MMKV;

    .line 66
    .line 67
    invoke-virtual {p0, v1, v2}, Lcom/tencent/mmkv/MMKV;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    move-object v1, p0

    .line 75
    check-cast v1, Lcm5;

    .line 76
    .line 77
    new-instance v2, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 78
    .line 79
    invoke-direct {v2, p1}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v1, v2, p2}, Lcm5;->d(Landroid/os/Parcelable;Ljava/lang/Object;)Lcm5;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0, p0, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    return-object p2
.end method
