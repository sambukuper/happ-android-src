.class public final Lov1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public a:Lje;

.field public b:Leb;

.field public c:J

.field public d:I

.field public final e:Lum0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lov1;->c:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lov1;->d:I

    .line 10
    .line 11
    new-instance v0, Lum0;

    .line 12
    .line 13
    invoke-direct {v0}, Lum0;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lov1;->e:Lum0;

    .line 17
    .line 18
    return-void
.end method
