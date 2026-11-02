.class public interface abstract Lh1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lcc1;


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lh1;->i()Lps;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    new-instance v0, Lq21;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lq21;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lps;->a(Lqj2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public build()Lsc0;
    .locals 1

    .line 1
    new-instance v0, Lsc0;

    .line 2
    .line 3
    invoke-interface {p0}, Lh1;->i()Lps;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lps;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lsc0;-><init>(Ljava/util/ArrayList;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public abstract i()Lps;
.end method

.method public abstract o()Lh1;
.end method
