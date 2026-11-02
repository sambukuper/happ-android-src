.class public final synthetic Lnn7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:Z

.field public final synthetic Y:Lb83;

.field public final synthetic Z:Ljava/lang/String;

.field public final synthetic f0:Ljava/lang/String;

.field public final synthetic g0:Lgn2;


# direct methods
.method public synthetic constructor <init>(ZLb83;Ljava/lang/String;Ljava/lang/String;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lnn7;->X:Z

    .line 5
    .line 6
    iput-object p2, p0, Lnn7;->Y:Lb83;

    .line 7
    .line 8
    iput-object p3, p0, Lnn7;->Z:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lnn7;->f0:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lnn7;->g0:Lgn2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Lek;

    .line 2
    .line 3
    move-object v6, p2

    .line 4
    check-cast v6, Llp2;

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
    invoke-virtual {v6, p2, p1}, Llp2;->N(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/FillElement;

    .line 33
    .line 34
    const/high16 v7, 0x30000

    .line 35
    .line 36
    iget-boolean v0, p0, Lnn7;->X:Z

    .line 37
    .line 38
    iget-object v1, p0, Lnn7;->Y:Lb83;

    .line 39
    .line 40
    iget-object v2, p0, Lnn7;->Z:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, p0, Lnn7;->f0:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, p0, Lnn7;->g0:Lgn2;

    .line 45
    .line 46
    invoke-static/range {v0 .. v7}, Li21;->e(ZLb83;Ljava/lang/String;Ljava/lang/String;Lgn2;Lkx4;Llp2;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v6}, Llp2;->Q()V

    .line 51
    .line 52
    .line 53
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 54
    .line 55
    return-object p0
.end method
