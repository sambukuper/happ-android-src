.class public abstract Lot4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget v0, Lw51;->n:F

    .line 2
    .line 3
    sput v0, Lot4;->a:F

    .line 4
    .line 5
    const/high16 v0, 0x41400000    # 12.0f

    .line 6
    .line 7
    new-instance v1, Lig5;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2, v0, v2}, Lig5;-><init>(FFFF)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
