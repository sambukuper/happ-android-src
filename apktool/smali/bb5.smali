.class public final synthetic Lbb5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Lai2;

.field public final synthetic Y:Lai2;

.field public final synthetic Z:Lai2;

.field public final synthetic f0:B

.field public final synthetic g0:Lsn;


# direct methods
.method public synthetic constructor <init>(Lai2;Lai2;Lai2;ILsn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbb5;->X:Lai2;

    .line 5
    .line 6
    iput-object p2, p0, Lbb5;->Y:Lai2;

    .line 7
    .line 8
    iput-object p3, p0, Lbb5;->Z:Lai2;

    .line 9
    .line 10
    iput-byte p4, p0, Lbb5;->f0:B

    .line 11
    .line 12
    iput-object p5, p0, Lbb5;->g0:Lsn;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lk50;

    .line 2
    .line 3
    iget-object v0, p0, Lbb5;->Y:Lai2;

    .line 4
    .line 5
    invoke-static {v0}, Lyn0;->a0(Lnh1;)Lmf5;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Lmf5;->getFocusOwner()Leh2;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lgh2;

    .line 14
    .line 15
    invoke-virtual {v1}, Lgh2;->f()Lai2;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lbb5;->X:Lai2;

    .line 20
    .line 21
    if-eq v2, v1, :cond_0

    .line 22
    .line 23
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    iget-object v1, p0, Lbb5;->Z:Lai2;

    .line 27
    .line 28
    iget-byte v2, p0, Lbb5;->f0:B

    .line 29
    .line 30
    iget-object p0, p0, Lbb5;->g0:Lsn;

    .line 31
    .line 32
    invoke-static {v0, v1, v2, p0}, Lkm4;->k0(Lai2;Lai2;ILsn;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez p0, :cond_2

    .line 41
    .line 42
    invoke-interface {p1}, Lk50;->a()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    :goto_0
    return-object v0
.end method
