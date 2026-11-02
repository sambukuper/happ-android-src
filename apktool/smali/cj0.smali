.class public interface abstract Lcj0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Llg0;
.implements Lgq8;


# virtual methods
.method public abstract a()Lxb4;
.end method

.method public abstract b()Lr85;
.end method

.method public c()Lxi0;
    .locals 0

    .line 1
    invoke-interface {p0}, Lcj0;->s()Laj0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public e()Z
    .locals 0

    .line 1
    invoke-interface {p0}, Lcj0;->c()Lxi0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lxi0;->j()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public abstract g()Lqh0;
.end method

.method public h()Lih0;
    .locals 0

    .line 1
    sget-object p0, Lmh0;->a:Llh0;

    .line 2
    .line 3
    return-object p0
.end method

.method public j(Lih0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public l(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public m()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public abstract n(Ljava/util/ArrayList;)V
.end method

.method public abstract o(Ljava/util/ArrayList;)V
.end method

.method public p()V
    .locals 0

    .line 1
    return-void
.end method

.method public q()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public r(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract s()Laj0;
.end method
