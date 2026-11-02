.class public final synthetic Lmw5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:Lum6;

.field public final synthetic Y:Z

.field public final synthetic Z:Z

.field public final synthetic f0:Lgn2;


# direct methods
.method public synthetic constructor <init>(Lum6;ZZLgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmw5;->X:Lum6;

    .line 5
    .line 6
    iput-boolean p2, p0, Lmw5;->Y:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lmw5;->Z:Z

    .line 9
    .line 10
    iput-object p4, p0, Lmw5;->f0:Lgn2;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Luw0;

    .line 2
    .line 3
    move-object v5, p2

    .line 4
    check-cast v5, Llp2;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p1, p2, 0x11

    .line 16
    .line 17
    const/16 p3, 0x10

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    if-eq p1, p3, :cond_0

    .line 21
    .line 22
    move p1, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    and-int/2addr p2, v0

    .line 26
    invoke-virtual {v5, p2, p1}, Llp2;->N(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 33
    .line 34
    const/16 v6, 0x6000

    .line 35
    .line 36
    iget-object v0, p0, Lmw5;->X:Lum6;

    .line 37
    .line 38
    iget-boolean v1, p0, Lmw5;->Y:Z

    .line 39
    .line 40
    iget-boolean v2, p0, Lmw5;->Z:Z

    .line 41
    .line 42
    iget-object v3, p0, Lmw5;->f0:Lgn2;

    .line 43
    .line 44
    invoke-static/range {v0 .. v6}, Lu70;->o(Lum6;ZZLgn2;Lkx4;Llp2;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {v5}, Llp2;->Q()V

    .line 49
    .line 50
    .line 51
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 52
    .line 53
    return-object p0
.end method
