.class public abstract Lyx1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lb81;

.field public static final b:Lb81;

.field public static final c:Lb81;

.field public static final d:Lb61;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lb81;

    .line 2
    .line 3
    const v1, 0x3ecccccd    # 0.4f

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const v3, 0x3e4ccccd    # 0.2f

    .line 8
    .line 9
    .line 10
    const/high16 v4, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-direct {v0, v1, v2, v3, v4}, Lb81;-><init>(FFFF)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lyx1;->a:Lb81;

    .line 16
    .line 17
    new-instance v0, Lb81;

    .line 18
    .line 19
    invoke-direct {v0, v2, v2, v3, v4}, Lb81;-><init>(FFFF)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lyx1;->b:Lb81;

    .line 23
    .line 24
    new-instance v0, Lb81;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2, v4, v4}, Lb81;-><init>(FFFF)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lyx1;->c:Lb81;

    .line 30
    .line 31
    new-instance v0, Lb61;

    .line 32
    .line 33
    const/16 v1, 0x15

    .line 34
    .line 35
    invoke-direct {v0, v1}, Lb61;-><init>(B)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lyx1;->d:Lb61;

    .line 39
    .line 40
    return-void
.end method
