.class public abstract Ldt8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:Lvj2;


# virtual methods
.method public abstract a(Lsv1;)V
.end method

.method public b()Lgn2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldt8;->a:Lvj2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldt8;->b()Lgn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public d(Lvj2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldt8;->a:Lvj2;

    .line 2
    .line 3
    return-void
.end method
