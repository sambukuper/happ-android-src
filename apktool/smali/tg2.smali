.class public final Ltg2;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lvg2;


# instance fields
.field public q0:Lgn2;

.field public r0:Lyh2;


# virtual methods
.method public final H(Lyh2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ltg2;->r0:Lyh2;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Ltg2;->r0:Lyh2;

    .line 10
    .line 11
    iget-object p0, p0, Ltg2;->q0:Lgn2;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
