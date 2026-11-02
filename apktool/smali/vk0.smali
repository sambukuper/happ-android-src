.class public final Lvk0;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic g0:Lea6;

.field public final synthetic h0:Lea6;

.field public final synthetic i0:Ldb;


# direct methods
.method public constructor <init>(Lea6;Lea6;Ldb;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvk0;->g0:Lea6;

    .line 2
    .line 3
    iput-object p2, p0, Lvk0;->h0:Lea6;

    .line 4
    .line 5
    iput-object p3, p0, Lvk0;->i0:Ldb;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq51;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lvk0;->m(Lq51;)Lq51;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lvk0;

    .line 8
    .line 9
    sget-object p1, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lvk0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final m(Lq51;)Lq51;
    .locals 3

    .line 1
    new-instance v0, Lvk0;

    .line 2
    .line 3
    iget-object v1, p0, Lvk0;->h0:Lea6;

    .line 4
    .line 5
    iget-object v2, p0, Lvk0;->i0:Ldb;

    .line 6
    .line 7
    iget-object p0, p0, Lvk0;->g0:Lea6;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p1}, Lvk0;-><init>(Lea6;Lea6;Ldb;Lq51;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lvk0;->g0:Lea6;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p1, Lea6;->X:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p1, p0, Lvk0;->h0:Lea6;

    .line 10
    .line 11
    iget-object p1, p1, Lea6;->X:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lvk0;->i0:Ldb;

    .line 16
    .line 17
    invoke-virtual {p0}, Ldb;->a()V

    .line 18
    .line 19
    .line 20
    new-instance p0, Lhb5;

    .line 21
    .line 22
    new-instance p1, Lai0;

    .line 23
    .line 24
    const/16 v1, 0xd

    .line 25
    .line 26
    invoke-direct {p1, v1}, Lai0;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {p0, v0, p1, v1}, Lhb5;-><init>(Ldb;Lai0;I)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    return-object v0
.end method
