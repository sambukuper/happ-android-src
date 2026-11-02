.class public final Lge8;
.super Lfe8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Lvt;

.field public final synthetic b:Lhe8;


# direct methods
.method public constructor <init>(Lhe8;Lvt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lge8;->b:Lhe8;

    .line 5
    .line 6
    iput-object p2, p0, Lge8;->a:Lvt;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Landroidx/transition/Transition;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lge8;->b:Lhe8;

    .line 2
    .line 3
    iget-object v0, v0, Lhe8;->Y:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iget-object v1, p0, Lge8;->a:Lvt;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ll97;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->y(Lzd8;)Landroidx/transition/Transition;

    .line 17
    .line 18
    .line 19
    return-void
.end method
