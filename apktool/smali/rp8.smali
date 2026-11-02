.class public final Lrp8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic j:[Lnw3;


# instance fields
.field public final a:Lcom/tencent/mmkv/MMKV;

.field public final b:Ljs5;

.field public final c:Ljs5;

.field public final d:Lis5;

.field public final e:Ljava/lang/String;

.field public final f:Landroid/net/Uri;

.field public final g:Lxe2;

.field public final h:Lo;

.field public final i:Lxe2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lmx5;

    .line 2
    .line 3
    const-class v1, Lrp8;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmx5;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    new-array v1, v1, [Lnw3;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v0, v1, v2

    .line 13
    .line 14
    sput-object v1, Lrp8;->j:[Lnw3;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    sget-object v0, Lkw4;->a:Lkw4;

    .line 2
    .line 3
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 8
    .line 9
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v2

    .line 26
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lrp8;->a:Lcom/tencent/mmkv/MMKV;

    .line 30
    .line 31
    new-instance v0, Ljs5;

    .line 32
    .line 33
    const-string v3, "update_params"

    .line 34
    .line 35
    invoke-direct {v0, v3}, Ljs5;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lrp8;->b:Ljs5;

    .line 39
    .line 40
    new-instance v0, Ljs5;

    .line 41
    .line 42
    const-string v3, "download_info"

    .line 43
    .line 44
    invoke-direct {v0, v3}, Ljs5;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lrp8;->c:Ljs5;

    .line 48
    .line 49
    const-string v0, "update"

    .line 50
    .line 51
    const/16 v3, 0xe

    .line 52
    .line 53
    invoke-static {v0, v2, v2, v3}, Lx97;->R(Ljava/lang/String;Llr5;Lvj2;I)Lis5;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lrp8;->d:Lis5;

    .line 58
    .line 59
    const-string v0, "/Happ_new.apk"

    .line 60
    .line 61
    invoke-static {v1, v0}, Lpc6;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lrp8;->e:Ljava/lang/String;

    .line 66
    .line 67
    const-string v1, "file://"

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, Lrp8;->f:Landroid/net/Uri;

    .line 78
    .line 79
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p0, v0}, Lrp8;->c(Lsu/happ/proxyutility/HappApplication;)Lna1;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {v0}, Lna1;->j()Lxe2;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v1, Lkp8;

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    invoke-direct {v1, v0, p0, v2}, Lkp8;-><init>(Lxe2;Lrp8;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {v1}, Lw51;->t(Lxe2;)Lxe2;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iput-object v0, p0, Lrp8;->g:Lxe2;

    .line 102
    .line 103
    new-instance v1, Lo;

    .line 104
    .line 105
    const/16 v2, 0x18

    .line 106
    .line 107
    invoke-direct {v1, v0, v2}, Lo;-><init>(Lxe2;B)V

    .line 108
    .line 109
    .line 110
    iput-object v1, p0, Lrp8;->h:Lo;

    .line 111
    .line 112
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p0, v0}, Lrp8;->c(Lsu/happ/proxyutility/HappApplication;)Lna1;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-interface {v0}, Lna1;->j()Lxe2;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    new-instance v1, Lkp8;

    .line 125
    .line 126
    const/4 v2, 0x1

    .line 127
    invoke-direct {v1, v0, p0, v2}, Lkp8;-><init>(Lxe2;Lrp8;B)V

    .line 128
    .line 129
    .line 130
    invoke-static {v1}, Lw51;->t(Lxe2;)Lxe2;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iput-object v0, p0, Lrp8;->i:Lxe2;

    .line 135
    .line 136
    return-void
.end method


# virtual methods
.method public final a(Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Ldp8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ldp8;

    .line 7
    .line 8
    iget v1, v0, Ldp8;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldp8;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldp8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ldp8;-><init>(Lrp8;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ldp8;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldp8;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 49
    .line 50
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, p1}, Lrp8;->c(Lsu/happ/proxyutility/HappApplication;)Lna1;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v1, Lep8;

    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    invoke-direct {v1, p0, v2, v4}, Lep8;-><init>(Lrp8;Lq51;B)V

    .line 62
    .line 63
    .line 64
    iput v3, v0, Ldp8;->h0:I

    .line 65
    .line 66
    invoke-static {p1, v1, v0}, Lwl7;->x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    sget-object p1, Lc71;->X:Lc71;

    .line 71
    .line 72
    if-ne p0, p1, :cond_3

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_3
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 76
    .line 77
    return-object p0
.end method

.method public final b(Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lfp8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lfp8;

    .line 7
    .line 8
    iget v1, v0, Lfp8;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lfp8;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lfp8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lfp8;-><init>(Lrp8;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lfp8;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lfp8;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 49
    .line 50
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, p1}, Lrp8;->c(Lsu/happ/proxyutility/HappApplication;)Lna1;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v1, Lep8;

    .line 59
    .line 60
    invoke-direct {v1, p0, v2, v3}, Lep8;-><init>(Lrp8;Lq51;B)V

    .line 61
    .line 62
    .line 63
    iput v3, v0, Lfp8;->h0:I

    .line 64
    .line 65
    invoke-static {p1, v1, v0}, Lwl7;->x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object p1, Lc71;->X:Lc71;

    .line 70
    .line 71
    if-ne p0, p1, :cond_3

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_3
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 75
    .line 76
    return-object p0
.end method

.method public final c(Lsu/happ/proxyutility/HappApplication;)Lna1;
    .locals 2

    .line 1
    sget-object v0, Lrp8;->j:[Lnw3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lrp8;->d:Lis5;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Lis5;->a(Lnw3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lna1;

    .line 13
    .line 14
    return-object p0
.end method

.method public final d(Ls51;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lgp8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lgp8;

    .line 7
    .line 8
    iget v1, v0, Lgp8;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lgp8;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lgp8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lgp8;-><init>(Lrp8;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lgp8;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lgp8;->h0:I

    .line 28
    .line 29
    sget-object v2, Ldn8;->a:Ldn8;

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    sget-object v5, Lc71;->X:Lc71;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v4, :cond_2

    .line 38
    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iput v4, v0, Lgp8;->h0:I

    .line 60
    .line 61
    iget-object p1, p0, Lrp8;->g:Lxe2;

    .line 62
    .line 63
    invoke-static {p1, v0}, Lgv3;->q(Lxe2;Ls51;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v5, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    :goto_1
    check-cast p1, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 71
    .line 72
    if-nez p1, :cond_5

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_5
    sget-object v1, Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;->SUCCESS:Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;

    .line 76
    .line 77
    invoke-static {p1, v1}, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;->b(Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;Lsu/happ/proxyutility/domain/routing/entity/StateDownloadFile;)Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput v3, v0, Lgp8;->h0:I

    .line 82
    .line 83
    invoke-virtual {p0, p1, v0}, Lrp8;->e(Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;Ls51;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, v5, :cond_6

    .line 88
    .line 89
    :goto_2
    return-object v5

    .line 90
    :cond_6
    :goto_3
    return-object v2
.end method

.method public final e(Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lpp8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lpp8;

    .line 7
    .line 8
    iget v1, v0, Lpp8;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lpp8;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lpp8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lpp8;-><init>(Lrp8;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lpp8;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lpp8;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p2, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 49
    .line 50
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p0, p2}, Lrp8;->c(Lsu/happ/proxyutility/HappApplication;)Lna1;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    new-instance v1, Lco;

    .line 59
    .line 60
    const/16 v4, 0xf

    .line 61
    .line 62
    invoke-direct {v1, p0, p1, v2, v4}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 63
    .line 64
    .line 65
    iput v3, v0, Lpp8;->h0:I

    .line 66
    .line 67
    invoke-static {p2, v1, v0}, Lwl7;->x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    sget-object p1, Lc71;->X:Lc71;

    .line 72
    .line 73
    if-ne p0, p1, :cond_3

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_3
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 77
    .line 78
    return-object p0
.end method

.method public final f(Lzo8;Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lqp8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lqp8;

    .line 7
    .line 8
    iget v1, v0, Lqp8;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lqp8;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lqp8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lqp8;-><init>(Lrp8;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lqp8;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lqp8;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p2, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 49
    .line 50
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p0, p2}, Lrp8;->c(Lsu/happ/proxyutility/HappApplication;)Lna1;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    new-instance v1, Lco;

    .line 59
    .line 60
    const/16 v4, 0x10

    .line 61
    .line 62
    invoke-direct {v1, p0, p1, v2, v4}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 63
    .line 64
    .line 65
    iput v3, v0, Lqp8;->h0:I

    .line 66
    .line 67
    invoke-static {p2, v1, v0}, Lwl7;->x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    sget-object p1, Lc71;->X:Lc71;

    .line 72
    .line 73
    if-ne p0, p1, :cond_3

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_3
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 77
    .line 78
    return-object p0
.end method
