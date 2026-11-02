.class public abstract Lyy7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Laq5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Laq5;

    .line 2
    .line 3
    sget-object v1, Ld02;->X:Ld02;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Laq5;-><init>(Ljava/util/List;Lzz2;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lyy7;->a:Laq5;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(Lkx4;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lkx4;
    .locals 3

    .line 1
    new-instance v0, Lvy7;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    invoke-direct {v0, p1, v1, p2, v2}, Lvy7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v0}, Lkx4;->y(Lkx4;)Lkx4;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
