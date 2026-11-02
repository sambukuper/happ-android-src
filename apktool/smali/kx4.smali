.class public interface abstract Lkx4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# virtual methods
.method public abstract d(Lrn2;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract g(Lgn2;)Z
.end method

.method public y(Lkx4;)Lkx4;
    .locals 1

    .line 1
    sget-object v0, Lhx4;->X:Lhx4;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lfx0;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lfx0;-><init>(Lkx4;Lkx4;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
