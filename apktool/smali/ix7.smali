.class public abstract Lix7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Landroid/util/Size;

.field public static final b:Lrx0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/Size;

    .line 2
    .line 3
    const/16 v1, 0x140

    .line 4
    .line 5
    const/16 v2, 0xf0

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lix7;->a:Landroid/util/Size;

    .line 11
    .line 12
    new-instance v0, Lrx0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, v1}, Lrx0;-><init>(Z)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lix7;->b:Lrx0;

    .line 19
    .line 20
    return-void
.end method
