.class public Lfx6;
.super Le1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ld71;


# instance fields
.field public final g0:Lq51;


# direct methods
.method public constructor <init>(Lq51;Ls61;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, Le1;-><init>(Ls61;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lfx6;->g0:Lq51;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final T()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final c()Ld71;
    .locals 1

    .line 1
    iget-object p0, p0, Lfx6;->g0:Lq51;

    .line 2
    .line 3
    instance-of v0, p0, Ld71;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ld71;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public d(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lfx6;->g0:Lq51;

    .line 2
    .line 3
    invoke-static {p0}, Lmb6;->H(Lq51;)Lq51;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, Lgv3;->Q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p0, p1}, Lop1;->a(Lq51;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lfx6;->g0:Lq51;

    .line 2
    .line 3
    invoke-static {p1}, Lgv3;->Q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Lq51;->f(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public o0()V
    .locals 0

    .line 1
    return-void
.end method
