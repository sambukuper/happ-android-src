.class public final Lh57;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Ljava/util/Collection;

.field public final b:Z

.field public final c:Lvz7;

.field public final d:Lvz7;

.field public final e:Lvz7;

.field public final f:Lvz7;

.field public final g:Lvz7;


# direct methods
.method public constructor <init>(Ljava/util/Collection;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh57;->a:Ljava/util/Collection;

    .line 5
    .line 6
    iput-boolean p2, p0, Lh57;->b:Z

    .line 7
    .line 8
    new-instance p1, Lg57;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-direct {p1, p0, p2}, Lg57;-><init>(Lh57;B)V

    .line 12
    .line 13
    .line 14
    new-instance p2, Lvz7;

    .line 15
    .line 16
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lh57;->c:Lvz7;

    .line 20
    .line 21
    new-instance p1, Lg57;

    .line 22
    .line 23
    const/4 p2, 0x1

    .line 24
    invoke-direct {p1, p0, p2}, Lg57;-><init>(Lh57;B)V

    .line 25
    .line 26
    .line 27
    new-instance p2, Lvz7;

    .line 28
    .line 29
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Lh57;->d:Lvz7;

    .line 33
    .line 34
    new-instance p1, Lg57;

    .line 35
    .line 36
    const/4 p2, 0x2

    .line 37
    invoke-direct {p1, p0, p2}, Lg57;-><init>(Lh57;B)V

    .line 38
    .line 39
    .line 40
    new-instance p2, Lvz7;

    .line 41
    .line 42
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, Lh57;->e:Lvz7;

    .line 46
    .line 47
    new-instance p1, Lg57;

    .line 48
    .line 49
    const/4 p2, 0x3

    .line 50
    invoke-direct {p1, p0, p2}, Lg57;-><init>(Lh57;B)V

    .line 51
    .line 52
    .line 53
    new-instance p2, Lvz7;

    .line 54
    .line 55
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Lh57;->f:Lvz7;

    .line 59
    .line 60
    new-instance p1, Lg57;

    .line 61
    .line 62
    const/4 p2, 0x4

    .line 63
    invoke-direct {p1, p0, p2}, Lg57;-><init>(Lh57;B)V

    .line 64
    .line 65
    .line 66
    new-instance p2, Lvz7;

    .line 67
    .line 68
    invoke-direct {p2, p1}, Lvz7;-><init>(Ldn2;)V

    .line 69
    .line 70
    .line 71
    iput-object p2, p0, Lh57;->g:Lvz7;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final a(Lwg1;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "CXCP"

    .line 5
    .line 6
    invoke-static {v0}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lh57;->a:Ljava/util/Collection;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Iterable;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    move-object v3, v1

    .line 35
    check-cast v3, Lhq8;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-boolean v4, p0, Lh57;->b:Z

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    iget-object v3, v3, Lhq8;->o:Lf57;

    .line 45
    .line 46
    :goto_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-object v3, v3, Lhq8;->p:Lf57;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    invoke-virtual {v3}, Lf57;->b()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-interface {v3, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move-object v1, v2

    .line 65
    :goto_2
    check-cast v1, Lhq8;

    .line 66
    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    iget-object p0, v1, Lhq8;->o:Lf57;

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    move-object p0, v2

    .line 73
    :goto_3
    sget-object p1, Ltp1;->a:Lnf1;

    .line 74
    .line 75
    sget-object p1, Ldm4;->a:Lhv2;

    .line 76
    .line 77
    iget-object p1, p1, Lhv2;->h0:Lhv2;

    .line 78
    .line 79
    invoke-static {p1}, Lgv3;->c(Ls61;)Lm51;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance v0, Ll40;

    .line 84
    .line 85
    const/16 v1, 0xe

    .line 86
    .line 87
    invoke-direct {v0, p0, v2, v1}, Ll40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 88
    .line 89
    .line 90
    const/4 p0, 0x3

    .line 91
    invoke-static {p1, v2, v2, v0, p0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 92
    .line 93
    .line 94
    return-void
.end method
