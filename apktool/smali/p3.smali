.class public interface abstract Lp3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lbc1;


# virtual methods
.method public d(Ldg5;)V
    .locals 3

    .line 1
    new-instance v0, Lc30;

    .line 2
    .line 3
    new-instance v1, Ls69;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, v2}, Ls69;-><init>(Ldg5;Z)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lc30;-><init>(Lz82;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v0}, Lp3;->h(Lc30;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public e(Ldg5;)V
    .locals 2

    .line 1
    new-instance v0, Lc30;

    .line 2
    .line 3
    new-instance v1, Ldy4;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ldy4;-><init>(Ldg5;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lc30;-><init>(Lz82;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Lp3;->h(Lc30;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public abstract h(Lc30;)V
.end method
