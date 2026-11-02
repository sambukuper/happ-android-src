.class public final Law7;
.super Lkv7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final u:Lsi3;

.field public v:F

.field public final w:Lzv7;


# direct methods
.method public constructor <init>(Ldw7;Lsi3;)V
    .locals 1

    .line 1
    iget-object v0, p2, Lsi3;->X:Lcom/tistory/zladnrms/roundablelayout/RoundableLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/l;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Law7;->u:Lsi3;

    .line 10
    .line 11
    new-instance v0, Lzv7;

    .line 12
    .line 13
    invoke-direct {v0, p1, p0, p2}, Lzv7;-><init>(Ldw7;Law7;Lsi3;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Law7;->w:Lzv7;

    .line 17
    .line 18
    return-void
.end method
