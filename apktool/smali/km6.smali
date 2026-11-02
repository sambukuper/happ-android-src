.class public abstract Lkm6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ljm6;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldl5;

    .line 2
    .line 3
    const/high16 v1, 0x42480000    # 50.0f

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldl5;-><init>(F)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljm6;

    .line 9
    .line 10
    invoke-direct {v1, v0, v0, v0, v0}, Ljm6;-><init>(Ln61;Ln61;Ln61;Ln61;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lkm6;->a:Ljm6;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(F)Ljm6;
    .locals 1

    .line 1
    new-instance v0, Llt1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Llt1;-><init>(F)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljm6;

    .line 7
    .line 8
    invoke-direct {p0, v0, v0, v0, v0}, Ljm6;-><init>(Ln61;Ln61;Ln61;Ln61;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
