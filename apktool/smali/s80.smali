.class public final synthetic Ls80;
.super Lno2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:Lt80;

.field public final synthetic Y:Li55;

.field public final synthetic Z:Lp5;


# direct methods
.method public constructor <init>(Lt80;Li55;Lp5;)V
    .locals 6

    .line 1
    iput-object p1, p0, Ls80;->X:Lt80;

    .line 2
    .line 3
    iput-object p2, p0, Ls80;->Y:Li55;

    .line 4
    .line 5
    iput-object p3, p0, Ls80;->Z:Lp5;

    .line 6
    .line 7
    const-string v4, "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const-class v2, Lch3;

    .line 12
    .line 13
    const-string v3, "localRect"

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    invoke-direct/range {v0 .. v5}, Lno2;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls80;->Y:Li55;

    .line 2
    .line 3
    iget-object v1, p0, Ls80;->Z:Lp5;

    .line 4
    .line 5
    iget-object p0, p0, Ls80;->X:Lt80;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lt80;->Y0(Lt80;Li55;Lp5;)Ls86;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
