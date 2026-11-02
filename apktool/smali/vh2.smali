.class public final Lvh2;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ls01;
.implements Llh2;
.implements Lqh2;


# instance fields
.field public q0:Loh2;

.field public final r0:Luh2;

.field public final s0:Luh2;


# direct methods
.method public constructor <init>(Loh2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvh2;->q0:Loh2;

    .line 5
    .line 6
    new-instance p1, Luh2;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, Luh2;-><init>(Lvh2;B)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lvh2;->r0:Luh2;

    .line 13
    .line 14
    new-instance p1, Luh2;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {p1, p0, v0}, Luh2;-><init>(Lvh2;B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lvh2;->s0:Luh2;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final E(Lhh2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvh2;->s0:Luh2;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lhh2;->a(Luh2;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lvh2;->r0:Luh2;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lhh2;->d(Luh2;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
